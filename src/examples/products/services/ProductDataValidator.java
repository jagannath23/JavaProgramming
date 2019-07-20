package examples.products.services;

import examples.products.services.exceptions.InvalidTitleException;

public class ProductDataValidator {
    private static final String TITLE_REGEX = "[a-zA-Z0-9._\\-]{3,}";

    public static void validateTitle(String title) throws InvalidTitleException {
        if (!title.matches(TITLE_REGEX)) {
            throw new InvalidTitleException(title);
        }
    }
}
