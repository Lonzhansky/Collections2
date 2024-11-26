package lesson22.app.validator.strategy;


import lesson22.app.model.User;

public interface UserValidationStrategy {
    boolean isValid(User user);
}