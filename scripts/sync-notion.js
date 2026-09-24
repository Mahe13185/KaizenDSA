function buildProperties(problem, includeRevision = false) {
    const today = new Date();

    const dateSolved = today.toISOString().split("T")[0];

    const nextRevisionDate = new Date(today);
    nextRevisionDate.setDate(nextRevisionDate.getDate() + 7);

    const nextRevision = nextRevisionDate.toISOString().split("T")[0];

    const properties = {
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
                start: dateSolved
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

    // Only set Next Revision when creating a NEW problem.
    if (includeRevision) {
        properties["Next Revision"] = {
            date: {
                start: nextRevision
            }
        };
    }

    return properties;
}