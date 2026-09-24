const fs = require("fs");
const path = require("path");

const leetcodeDir = path.join(process.cwd(), "LeetCode");

if (!fs.existsSync(leetcodeDir)) {
    console.log("LeetCode directory not found.");
    process.exit(1);
}

const folders = fs.readdirSync(leetcodeDir, { withFileTypes: true })
    .filter(entry => entry.isDirectory());

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
    const readme = files.find(file => file.toLowerCase() === "readme.md");

    if (!readme) {
        continue;
    }

    const readmePath = path.join(folderPath, readme);
    const content = fs.readFileSync(readmePath, "utf8");

    // Extract problem name from <h2><a ...>Problem Name</a></h2>
    const problemMatch = content.match(
        /<h2>\s*<a[^>]*>(.*?)<\/a>\s*<\/h2>/is
    );

    // Extract LeetCode URL from the same <h2> link
    const linkMatch = content.match(
        /<h2>\s*<a\s+href=['"]([^'"]+)['"]/i
    );

    // Extract difficulty from the badge
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

problems.sort((a, b) => a.problemId - b.problemId);

console.log(JSON.stringify(problems, null, 2));