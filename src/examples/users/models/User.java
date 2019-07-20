package examples.users.models;

import examples.users.services.exceptions.InvalidUsernameException;
import examples.users.services.UserDataValidator;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String username;

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) throws InvalidUsernameException {
        UserDataValidator.validateUsername(username);
        this.username = username;
    }

    public void tryToSetUsernameOrFail(Scanner scanner) {
        try {
            this.setUsername(scanner.nextLine());
        } catch (InvalidUsernameException invalid_username) {
            System.out.println(invalid_username.toString());
        }
    }

    public static User search(Scanner scanner, ArrayList<User> users) {
        String username_to_search;
        System.out.println("Enter the username: ");
        username_to_search = scanner.nextLine();
        for (User user : users) {
            if (user.getUsername().equals(username_to_search)) {
                return user;
            }
        }
        System.out.println("User not found: ");
        return null;
    }
}
