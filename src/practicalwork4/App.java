package practicalwork4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        Scanner scanner = new Scanner(System.in);

        array.add(scanner.nextLine());
        array.add(scanner.nextLine());
        array.add(scanner.nextLine());
        array.add(scanner.nextLine());
        array.add(scanner.nextLine());
        array.add(scanner.nextLine());
        array.add(scanner.nextLine());

        array.index();
    }
}
