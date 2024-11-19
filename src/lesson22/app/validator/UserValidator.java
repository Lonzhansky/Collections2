package lesson22.app.validator;

import lesson22.app.model.User;

public class UserValidator implements Validator<User> {
    @Override
    public boolean isValid(User user) {
        return user.getEmail().contains("@") && !user.getName().isBlank();
    }
}