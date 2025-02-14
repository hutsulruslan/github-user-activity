package org.hutsdev.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GitHubService {
    private final ApiClient apiClient;

    public GitHubService() {
        this.apiClient = new ApiClient();
    }

    public void fetchUserActivity(String username) {
        String url = "https://api.github.com/users/" + username + "/events";
        String jsonResponse = apiClient.get(url);

        if (jsonResponse == null) {
            System.out.println("Failed to retrieve activity.");
            return;
        }

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode events = mapper.readTree(jsonResponse);

            System.out.println("Recent GitHub activity for: " + username);
            for (int i = 0; i < Math.min(events.size(), 5); i++) {
                JsonNode event = events.get(i);
                System.out.println("- " + event.get("type").asText() + " at " + event.get("repo").get("name").asText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
