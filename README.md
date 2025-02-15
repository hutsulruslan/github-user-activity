# GitHub User Activity

![GitHubUserActivity](https://img.shields.io/badge/GitHubUserActivity-v1.0-blue.svg)

GitHub User Activity is a Java-based application that fetches and analyzes GitHub user activity, providing insights into repositories, commits, and contributions.

## 🚀 Features

✅ **Fetch User Activity** — Retrieve GitHub user data via API.  
🚧 **Analyze Contributions** — Work in progress: developing insights into commits, repositories, and languages.  
🚧 **Generate Reports** — Work in progress: exporting user activity details in a structured format. 
✅ **Easy Configuration** — Configure API keys and settings easily.

## 📥 Installation

### 1. Clone the Repository

```bash
git clone https://github.com/hutsulruslan/github-user-activity.git
cd github-user-activity
```

### 2. Build the Project

Make sure you have [Maven](https://maven.apache.org/) installed and Java **21**, then run:

```bash
mvn clean package
```

This command will compile the project and create an executable JAR file.

## ▶️ Usage

Run the application using:

```bash
java -jar target/github-user-activity-1.0-SNAPSHOT-jar-with-dependencies.jar
```

### 📌 Configuration

To use this application, you may need to configure your GitHub API token. Update the `config.properties` file or pass it as an argument:

```bash
java -jar target/github-user-activity-1.0-SNAPSHOT-jar-with-dependencies.jar --token=YOUR_GITHUB_TOKEN
```

### 📌 Example Commands:

| Command | Description |
|---------|------------|
| `git-activity [username]` | Fetch activity for a GitHub user |
| `exit` | Closes the program |

## 🤝 Contributing

Any contributions are welcome! If you'd like to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b new-feature`).
3. Make your changes and commit them (`git commit -m 'Add new feature'`).
4. Push the branch (`git push origin new-feature`).
5. Open a Pull Request.

---
https://roadmap.sh/projects/github-user-activity
---

💡 *GitHub User Activity — analyze and track GitHub contributions easily!*
