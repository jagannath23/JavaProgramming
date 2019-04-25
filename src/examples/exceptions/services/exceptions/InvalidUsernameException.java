package examples.exceptions.services.exceptions;

public class InvalidUsernameException extends Exception {
    private String username;

    public InvalidUsernameException(String username) {
        this.username = username;
    }

    public String toString() {
        return "InvalidUsernameException[" + this.username + "]";
    }
}
