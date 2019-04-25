package examples.exceptions.app;

import examples.exceptions.services.exceptions.InvalidUsernameException;
import examples.exceptions.models.User;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        User a_user = new User();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a username: ");
        try {
            a_user.setUsername(scanner.nextLine());
            System.out.println("username correct: " + a_user.getUsername());
        } catch (InvalidUsernameException e) {
            System.out.println(e.toString());
        }
    }
}
