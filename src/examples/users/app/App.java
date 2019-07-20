package examples.users.app;

import examples.users.controllers.UserController;
import examples.users.models.User;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean not_want_exit = true;
        ArrayList<User> users = new ArrayList<>();

        while (not_want_exit) {
            App.showMenu();
            not_want_exit = App.handleUserActions(users);
        }
    }

    private static void showMenu() {
        System.out.println("\nWhat do you want to do?" +
                "\n1. Add a user" +
                "\n2. List users" +
                "\n3. Update a user" +
                "\n4. Delete a user" +
                "\n5. Exit");
        System.out.print("\nEnter an option: ");
    }

    private static boolean handleUserActions(ArrayList<User> users) {
        int option;
        Scanner scanner = new Scanner(System.in);

        option = scanner.nextInt();
        switch (option) {
            case 1:
                UserController.add(users);
                return true;
            case 2:
                UserController.index(users);
                return true;
            case 3:
                UserController.update(users);
                return true;
            case 4:
                UserController.delete(users);
                return true;
            case 5:
                return false;
            default:
                System.out.println("\nIncorrect option, select other");
                return true;
        }
    }
}
