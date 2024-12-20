package lesson22.app.validator.context;

import lesson22.app.model.User;
import lesson22.app.validator.strategy.UserValidationStrategy;

public class UserValidatorContext {
    private UserValidationStrategy strategy;

    public void setStrategy(UserValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(User user) {
        if (strategy == null) {
            throw new IllegalStateException("Validation strategy not set");
        }
        return strategy.isValid(user);
    }
}