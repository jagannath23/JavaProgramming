package PracticalWork2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person aPerson = new Person();
        Student aStudent = new Student();
        Teacher aTeacher = new Teacher();

        ArrayList<Person> persons = new ArrayList<>(3);
        persons.add(aPerson);
        persons.add(aStudent);
        persons.add(aTeacher);

        for (Person person : persons) {
            String classType = person.getClass().getSimpleName();
            switch (classType) {
                case "Person":
                    PersonData.enterPersonData(person, scanner);
                    break;
                case "Student":
                    PersonData.enterStudentData((Student) person, scanner);
                    break;
                case "Teacher":
                    PersonData.enterTeacherData((Teacher) person, scanner);
                    break;
                default:
                    System.out.println("Class type undefined");
            }
            App.showData(classType, "DU: " + person.DU);
            App.showData(classType, "first name: " + person.firstName);
            App.showData(classType, "last name: " + person.lastName);
        }
    }

    private static void showData(String classType, String data) {
        System.out.println(classType + " " + data);
    }
}