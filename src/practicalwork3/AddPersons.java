package practicalwork3;

import java.util.ArrayList;
import java.util.Scanner;

public class AddPersons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();
        int number_of_persons;

        System.out.println("\nAdd persons to the group." +
                "\nHow many you want to add? ");
        number_of_persons = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= number_of_persons; i++) {
            System.out.println("\nEnter first name, second name and DNI: ");
            Person person = new Person();
            person.setFirstName(scanner.nextLine());
            person.setSecondName(scanner.nextLine());
            person.setDNI(scanner.nextInt());
            scanner.nextLine();
            persons.add(person);
        }

        System.out.println("\nPeople added: ");
        for (Person person : persons) {
            System.out.println("\nName: " + person.getFirstName()
                    + "\nSecond name: " + person.getSecondName()
                    + "\nDNI: " + person.getDNI());
        }
    }
}
