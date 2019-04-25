package examples.exceptions.models;

import examples.exceptions.services.exceptions.InvalidUsernameException;
import examples.exceptions.services.UserDataValidator;

public class User {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws InvalidUsernameException {
        UserDataValidator.validateUsername(username);
        this.username = username;
    }
}
