package practicalwork3;

class Person {
    private String first_name;
    private String second_name;
    private Integer DNI;

    String getFirstName() {
        return first_name;
    }

    void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    String getSecondName() {
        return second_name;
    }

    void setSecondName(String second_name) {
        this.second_name = second_name;
    }

    Integer getDNI() {
        return DNI;
    }

    void setDNI(Integer DNI) {
        this.DNI = DNI;
    }
}
