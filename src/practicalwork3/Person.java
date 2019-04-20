package practicalwork3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person {
    private String first_name;
    private String second_name;
    private Integer DNI;

    String getFirstName() {
        return first_name;
    }

    private void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    String getSecondName() {
        return second_name;
    }

    private void setSecondName(String second_name) {
        this.second_name = second_name;
    }

    Integer getDNI() {
        return DNI;
    }

    private void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    static void showMessage(String message) {
        System.out.print(message);
    }

    private static int enterDNI(Scanner scanner) {
        Person.showMessage("DNI: ");
        int DNI = scanner.nextInt();
        scanner.nextLine();

        return DNI;
    }

    private static Map<String, String> enterName(Scanner scanner) {
        Person.showMessage("Enter first name: ");
        String first_name = scanner.nextLine();
        Person.showMessage("Enter second name: ");
        String second_name = scanner.nextLine();
        Map<String, String> names = new HashMap<>();
        names.put("first_name", first_name);
        names.put("second_name", second_name);

        return names;
    }

    void enterPersonData(Scanner scanner) {
        int DNI = Person.enterDNI(scanner);
        this.setDNI(DNI);

        Map<String, String> names = Person.enterName(scanner);

        String first_name = names.get("first_name");
        String second_name = names.get("second_name");

        this.setFirstName(first_name);
        this.setSecondName(second_name);
    }
}
