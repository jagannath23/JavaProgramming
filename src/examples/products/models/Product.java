package examples.products.models;

import examples.products.services.ProductDataValidator;
import examples.products.services.exceptions.InvalidTitleException;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String title;
    private Float price;
    private Integer stock;

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) throws InvalidTitleException {
        ProductDataValidator.validateTitle(title);
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void tryToSetTitleOrFail(Scanner scanner) {
        try {
            this.setTitle(scanner.nextLine());
        } catch (InvalidTitleException invalid_title) {
            System.out.println(invalid_title.toString());
        }
    }

    public static Product search(Scanner scanner, ArrayList<Product> products) {
        String title_to_search;
        System.out.println("Enter the title: ");
        title_to_search = scanner.nextLine();
        for (Product product : products) {
            try {
                if (product.getTitle().equals(title_to_search)) {
                    return product;
                }
            } catch (NullPointerException null_pointer) {
                System.out.println("There can not be a null product");
                return null;
            }
        }
        System.out.println("Product not found: ");
        return null;
    }
}
