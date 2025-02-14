package org.hutsdev.config;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    private static final Dotenv dotenv = Dotenv.configure()
            .directory(System.getProperty("user.dir"))
            .ignoreIfMissing()
            .load();

    public static String getGithubToken() {
        String token = dotenv.get("GITHUB_TOKEN");
        if(token == null || token.isEmpty()) {
            System.out.println("⚠ Warning: No GitHub token found. Running in limited mode (60 requests/hour).");
            return null;
        }
        return token;
    }
}
