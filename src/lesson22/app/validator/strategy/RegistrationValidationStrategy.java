package lesson22.app.validator.strategy;

import lesson22.app.model.User;

public class RegistrationValidationStrategy implements UserValidationStrategy {

    @Override
    public boolean isValid(User user) {
        return user.getEmail().contains("@") &&
                !user.getName().isBlank() &&
                user.getRole() != null;
    }
}