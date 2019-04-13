package PracticalWork2;

public class Student extends Person {
    String career;

    public void enterData(int DU, String firstName, String lastName, String career) {
        this.DU = DU;
        this.firstName = firstName;
        this.lastName = lastName;
        this.career = career;
    }
}