package examples.products.services.exceptions;

public class InvalidTitleException extends Exception {
    private String title;

    public InvalidTitleException(String title) {
        this.title = title;
    }

    public String toString() {
        return "InvalidTitleException[" + this.title + "]";
    }
}
