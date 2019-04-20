package practicalwork3;

import java.util.ArrayList;
import java.util.Scanner;

public class AcademyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int number_of_students;

        System.out.println("\nAdd students to your academy." +
                "\nHow many you want to add? ");
        number_of_students = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= number_of_students; i++) {
            System.out.println("\nEnter first name, second name, DNI and the experience with languages: ");
            Student student = new Student();
            student.enterStudentData(scanner);
            students.add(student);
        }

        System.out.println("\nStudents added (comparison of experience with languages): \n");
        System.out.printf("%14s", "name");
        for (String language : Student.LANGUAGES) {
            System.out.printf(" | %12s", language);
        }
        System.out.println("\n--------------------------------------------------------------------------------");
        for (Student student : students) {
            System.out.printf("%8s %8s", student.getFirstName(), student.getSecondName() + " | ");

            student.getStudentExperience();
        }
    }
}
