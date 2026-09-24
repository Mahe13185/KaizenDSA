const fs = require("fs");
const path = require("path");

const NOTION_TOKEN = process.env.NOTION_TOKEN;
const DATA_SOURCE_ID = "3e5592da-37f5-80e9-8db0-000b3d45bb2d";
const DATABASE_ID = "3e5592da-37f5-80d1-979b-d4bcc32fa42e";

const NOTION_VERSION = "2026-03-11";
const GITHUB_REPO = "https://github.com/Mahe13185/KaizenDSA";

if (!NOTION_TOKEN) {
    console.error("NOTION_TOKEN is missing.");
    process.exit(1);
}

const headers = {
    "Authorization": `Bearer ${NOTION_TOKEN}`,
    "Notion-Version": NOTION_VERSION,
    "Content-Type": "application/json"
};

async function notionRequest(url, options = {}) {
    const response = await fetch(url, {
        ...options,
        headers: {
            ...headers,
            ...(options.headers || {})
        }
    });

    const data = await response.json();

    if (!response.ok) {
        console.error("Notion API error:");
        console.error(JSON.stringify(data, null, 2));
        process.exit(1);
    }

    return data;
}

// --------------------------------------------------
// Read LeetCode folders
// --------------------------------------------------

function scanLeetCode() {
    const leetcodeDir = path.join(process.cwd(), "LeetCode");

    if (!fs.existsSync(leetcodeDir)) {
        throw new Error("LeetCode directory not found.");
    }

    const folders = fs.readdirSync(leetcodeDir, {
        withFileTypes: true
    }).filter(entry => entry.isDirectory());

    const problems = [];

    for (const folder of folders) {
        const folderName = folder.name;

        const match = folderName.match(/^(\d+)-(.+)$/);

        if (!match) {
            continue;
        }

        const problemId = Number(match[1]);
        const folderPath = path.join(leetcodeDir, folderName);

        const files = fs.readdirSync(folderPath);

        const readme = files.find(
            file => file.toLowerCase() === "readme.md"
        );

        if (!readme) {
            continue;
        }

        const content = fs.readFileSync(
            path.join(folderPath, readme),
            "utf8"
        );

        const problemMatch = content.match(
            /<h2>\s*<a[^>]*>(.*?)<\/a>\s*<\/h2>/is
        );

        const linkMatch = content.match(
            /<h2>\s*<a\s+href=['"]([^'"]+)['"]/i
        );

        const difficultyMatch = content.match(
            /Difficulty-([A-Za-z]+)/i
        );

        const problem = problemMatch
            ? problemMatch[1].trim()
            : folderName;

        const leetcodeLink = linkMatch
            ? linkMatch[1]
            : null;

        const difficulty = difficultyMatch
            ? difficultyMatch[1].charAt(0).toUpperCase() +
            difficultyMatch[1].slice(1).toLowerCase()
            : "Unknown";

        problems.push({
            problem,
            platform: "LeetCode",
            problemId,
            difficulty,
            githubPath: `LeetCode/${folderName}`,
            leetcodeLink
        });
    }

    return problems;
}

// --------------------------------------------------
// Get existing Notion pages
// --------------------------------------------------

async function getExistingPages() {
    const pages = [];

    let cursor = undefined;

    do {
        const body = cursor
            ? { start_cursor: cursor }
            : {};

        const result = await notionRequest(
            `https://api.notion.com/v1/data_sources/${DATA_SOURCE_ID}/query`,
            {
                method: "POST",
                body: JSON.stringify(body)
            }
        );

        pages.push(...result.results);

        cursor = result.has_more
            ? result.next_cursor
            : undefined;

    } while (cursor);

    return pages;
}

// --------------------------------------------------
// Extract Problem ID from Notion page
// --------------------------------------------------

function getProblemId(page) {
    const property = page.properties["Problem ID"];

    if (!property || property.type !== "number") {
        return null;
    }

    return property.number;
}

// --------------------------------------------------
// Build Notion properties
// --------------------------------------------------

function buildProperties(problem) {
    const today = new Date().toISOString().split("T")[0];

    return {
        "Problem": {
            title: [
                {
                    text: {
                        content: problem.problem
                    }
                }
            ]
        },

        "Platform": {
            rich_text: [
                {
                    text: {
                        content: problem.platform
                    }
                }
            ]
        },

        "Problem ID": {
            number: problem.problemId
        },

        "Difficulty": {
            select: {
                name: problem.difficulty
            }
        },

        "Date Solved": {
            date: {
                start: today
            }
        },

        "Status": {
            select: {
                name: "Completed"
            }
        },

        "GitHub Link": {
            url: `${GITHUB_REPO}/tree/main/${problem.githubPath}`
        },

        "LeetCode Link": {
            url: problem.leetcodeLink
        }
    };
}

// --------------------------------------------------
// Create Notion page
// --------------------------------------------------

async function createPage(problem) {
    console.log(`Creating: ${problem.problem}`);

    await notionRequest(
        "https://api.notion.com/v1/pages",
        {
            method: "POST",
            body: JSON.stringify({
                parent: {
                    type: "data_source_id",
                    data_source_id: DATA_SOURCE_ID
                },
                properties: buildProperties(problem)
            })
        }
    );
}

// --------------------------------------------------
// Update existing Notion page
// --------------------------------------------------

async function updatePage(pageId, problem) {
    console.log(`Updating: ${problem.problem}`);

    await notionRequest(
        `https://api.notion.com/v1/pages/${pageId}`,
        {
            method: "PATCH",
            body: JSON.stringify({
                properties: buildProperties(problem)
            })
        }
    );
}

// --------------------------------------------------
// Main
// --------------------------------------------------

async function main() {
    console.log("Scanning LeetCode folders...");

    const problems = scanLeetCode();

    console.log(`Found ${problems.length} LeetCode problems.`);

    console.log("Reading existing Notion rows...");

    const existingPages = await getExistingPages();

    const existingById = new Map();

    for (const page of existingPages) {
        const problemId = getProblemId(page);

        if (problemId !== null) {
            existingById.set(problemId, page);
        }
    }

    for (const problem of problems) {
        const existingPage = existingById.get(problem.problemId);

        if (existingPage) {
            await updatePage(existingPage.id, problem);
        } else {
            await createPage(problem);
        }
    }

    console.log("Notion sync completed.");
}

main().catch(error => {
    console.error(error);
    process.exit(1);
});