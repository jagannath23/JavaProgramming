package examples.products.controllers;

import examples.products.models.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);

    public static void add(ArrayList<Product> products) {
        Product product = new Product();

        System.out.println("\nEnter a title");
        product.tryToSetTitleOrFail(scanner);

        products.add(product);
    }

    public static void index(ArrayList<Product> products) {
        if (products.isEmpty()) {
            System.out.println("\nProducts: ");
            System.out.println("Products list is empty");
        }

        for (Product product : products) {
            System.out.println("- " + product.getTitle());
        }
    }

    public static void update(ArrayList<Product> products) {
        ProductController.index(products);

        System.out.println("\nSelect a product to update");
        Product product = Product.search(scanner, products);
        if (product != null) {
            System.out.println("Enter new title: ");
            product.tryToSetTitleOrFail(scanner);
        }
    }

    public static void delete(ArrayList<Product> products) {
        ProductController.index(products);

        System.out.println("\nSelect a product to delete");
        Product product = Product.search(scanner, products);
        if (product != null) {
            products.remove(product);
            System.out.println("User deleted");
        }
    }
}
