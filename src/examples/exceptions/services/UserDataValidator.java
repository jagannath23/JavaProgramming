package examples.exceptions.services;

import examples.exceptions.services.exceptions.InvalidUsernameException;

public class UserDataValidator {
    private static final String USERNAME_REGEX = "[a-zA-Z0-9._\\-]{3,}";

    public static void validateUsername(String username) throws InvalidUsernameException {
        if (!username.matches(USERNAME_REGEX)) {
            throw new InvalidUsernameException(username);
        }
    }
}
