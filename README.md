GitHub User Activity Tracker

A simple Java-based command-line application that fetches recent activity from a GitHub user's profile using the GitHub API. It retrieves and displays the user's public events such as commits, issues, and pull requests. This project demonstrates how to interact with the GitHub API and securely handle authentication via environment variables.

Features

Fetch GitHub user activity using the GitHub API.

Display recent activity (up to 5 events) from the user's profile.

Secure authentication using a personal access token (stored in a .env file).

Command-line interface for easy interaction.

Requirements

Java 21 or above.

Maven for dependency management.

GitHub personal access token for authentication.

Installation

1. Clone the repository:

git clone https://github.com/yourusername/GitHubUserActivity.git

2. Install dependencies:

Navigate to the project directory and run:

mvn clean install

This will download and install all necessary dependencies.

3. Set up your GitHub personal access token:

Create a .env file in the root of the project and add your GitHub personal access token like this:

GITHUB_TOKEN=your_personal_access_token_here

Note: Be sure to keep your .env file private and do not push it to GitHub. It should be added to .gitignore to ensure it is not committed to the repository.

4. Run the application:

You can now run the application using the following command:

mvn exec:java -Dexec.mainClass="org.hutsdev.Main"

5. Command options:

After launching the application, you can enter the following commands:

github-activity <username>: Fetch and display the recent activity of a GitHub user.

exit: Exit the program.

Example

Choose command below:
1. github-activity <username>
2. exit

> github-activity octocat
Recent GitHub activity for: octocat
- PushEvent at octocat/Hello-World
- PullRequestEvent at octocat/Hello-World
- PushEvent at octocat/Spoon-Knife
- PushEvent at octocat/Spoon-Knife
- WatchEvent at octocat/Hello-World

Contributing

Fork the repository.

Create a new branch (git checkout -b feature-branch).

Commit your changes (git commit -am 'Add new feature').

Push to the branch (git push origin feature-branch).

Create a new Pull Request.

Acknowledgements

GitHub API: For providing access to GitHub user data.

OkHttp: For handling HTTP requests.

dotenv-java: For securely managing environment variables.
