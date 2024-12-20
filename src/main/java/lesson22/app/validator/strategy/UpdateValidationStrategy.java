package lesson22.app.validator.strategy;

import lesson22.app.model.User;

public class UpdateValidationStrategy implements UserValidationStrategy {

    @Override
    public boolean isValid(User user) {
        return (user.getEmail() == null || user.getEmail().contains("@")) &&
                (user.getName() == null || !user.getName().isBlank());
    }
}