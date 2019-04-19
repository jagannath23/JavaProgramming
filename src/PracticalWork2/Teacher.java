package practicalwork2;

public class Teacher extends Person {
    String professionalTitle;

    public void enterData(int DU, String firstName, String lastName, String professionalTitle) {
        this.DU = DU;
        this.firstName = firstName;
        this.lastName = lastName;
        this.professionalTitle = professionalTitle;
    }
}