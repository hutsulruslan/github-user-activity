package org.hutsdev;

import org.hutsdev.service.GitHubService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GitHubService gitHubService = new GitHubService();

        System.out.println("Choose command below:");
        System.out.println("1. github-activity <username>\n" +
                           "2. exit");

        while (true) {
            System.out.print("> ");
            String option = scanner.nextLine();
            String[] commandArgs = option.split(" ", 2);

            String command = commandArgs[0];
            switch (command) {
                case "github-activity" -> {
                    if (commandArgs.length < 2) {
                        System.out.println("Usage: github-activity <username>");
                    }
                    else {
                        gitHubService.fetchUserActivity(commandArgs[1]);
                    }
                }
                case "exit" -> {
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Unknown command! Please, try again.");
            }
        }
    }
}