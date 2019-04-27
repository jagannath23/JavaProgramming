package examples.exceptions.controllers;

import examples.exceptions.models.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserController {
    private static Scanner scanner = new Scanner(System.in);

    public static void add(ArrayList<User> users) {
        User user = new User();

        System.out.println("\nEnter a username");
        user.tryToSetUsernameOrFail(scanner);

        users.add(user);
    }

    public static void index(ArrayList<User> users) {
        if (users.isEmpty()) {
            System.out.println("\nUsers: ");
            System.out.println("Users list is empty");
        }

        for (User user : users) {
            System.out.println("- " + user.getUsername());
        }
    }

    public static void update(ArrayList<User> users) {
        UserController.index(users);

        System.out.println("\nSelect a user to update");
        User user = User.search(scanner, users);
        if (user != null) {
            System.out.println("Enter new username: ");
            user.tryToSetUsernameOrFail(scanner);
        }
    }

    public static void delete(ArrayList<User> users) {
        UserController.index(users);

        System.out.println("\nSelect a user to delete");
        User user = User.search(scanner, users);
        if (user != null) {
            users.remove(user);
            System.out.println("User deleted");
        }
    }
}
