package practicalwork2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PersonData {

    private static void showMessage(String message) {
        System.out.print(message);
    }

    private static int enterDU(Scanner scanner) {
        PersonData.showMessage("Enter your DU: ");
        int DU = scanner.nextInt();
        scanner.nextLine();

        return DU;
    }

    private static Map<String, String> enterName(Scanner scanner) {
        PersonData.showMessage("Enter your first name: ");
        String firstName = scanner.nextLine();
        PersonData.showMessage("Enter your last name: ");
        String lastName = scanner.nextLine();
        Map<String, String> names = new HashMap<>();
        names.put("first_name", firstName);
        names.put("last_name", lastName);

        return names;
    }

    static void enterPersonData(Person person, Scanner scanner) {
        int DU = PersonData.enterDU(scanner);

        Map<String, String> names = PersonData.enterName(scanner);

        String firstName = names.get("first_name");
        String lastName = names.get("last_name");

        person.enterData(DU, firstName, lastName);
    }

    static void enterStudentData(Student student, Scanner scanner) {
        int DU = PersonData.enterDU(scanner);

        Map<String, String> names = PersonData.enterName(scanner);

        String firstName = names.get("first_name");
        String lastName = names.get("last_name");

        PersonData.showMessage("Enter your career: ");
        String career = scanner.nextLine();

        student.enterData(DU, firstName, lastName, career);
    }

    static void enterTeacherData(Teacher teacher, Scanner scanner) {
        int DU = PersonData.enterDU(scanner);

        Map<String, String> names = PersonData.enterName(scanner);

        String firstName = names.get("first_name");
        String lastName = names.get("last_name");

        PersonData.showMessage("Enter your professional title: ");
        String career = scanner.nextLine();

        teacher.enterData(DU, firstName, lastName, career);
    }
}
