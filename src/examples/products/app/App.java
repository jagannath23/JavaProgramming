package examples.products.app;

import examples.products.controllers.ProductController;
import examples.products.models.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean not_want_exit = true;
        ArrayList<Product> products = new ArrayList<>();

        while (not_want_exit) {
            App.showMenu();
            not_want_exit = App.handleUserActions(products);
        }
    }

    private static void showMenu() {
        System.out.println("\nWhat do you want to do?" +
                "\n1. Add a product" +
                "\n2. List products" +
                "\n3. Update a product" +
                "\n4. Delete a product" +
                "\n5. Exit");
        System.out.print("\nEnter an option: ");
    }


    private static boolean handleUserActions(ArrayList<Product> products) {
        int option;
        Scanner scanner = new Scanner(System.in);

        option = scanner.nextInt();
        switch (option) {
            case 1:
                ProductController.add(products);
                return true;
            case 2:
                ProductController.index(products);
                return true;
            case 3:
                ProductController.update(products);
                return true;
            case 4:
                ProductController.delete(products);
                return true;
            case 5:
                return false;
            default:
                System.out.println("\nIncorrect option, select other");
                return true;
        }
    }
}
