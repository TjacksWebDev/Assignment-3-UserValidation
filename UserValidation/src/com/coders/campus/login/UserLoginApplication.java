package com.coders.campus.login;

import java.util.List;
import java.util.Scanner;

public class UserLoginApplication {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> users = userService.readUserDataFromFile("data.txt");

        Scanner scanner = new Scanner(System.in);
        int loginAttempts = 0;
        boolean loggedIn = false;

        while (loginAttempts < 5 && !loggedIn) {
            System.out.print("Enter your email: ");
            String email = scanner.nextLine().toLowerCase();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            for (User user : users) {
                if (user.getUsername().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
                    System.out.println("Welcome: " + user.getName());
                    loggedIn = true;
                    break;
                }
            }

            if (!loggedIn) {
                System.out.println("Invalid login, please try again");
                loginAttempts++;
            }
        }

        if (!loggedIn) {
            System.out.println("Too many failed login attempts, you are now locked out.");
        }
    }
}

