package lesson22.app.service;

import lesson22.app.model.User;
import lesson22.app.repository.Repository;
import lesson22.app.repository.LocalRepository;
import lesson22.app.validator.Validator;

import java.util.List;
import java.util.Optional;

public class RegistrationService {
    private final Repository<User> userRepository;
    private final Validator<User> validator;

    public RegistrationService(Repository<User> userRepository, Validator<User> validator) {
        this.userRepository = userRepository;
        this.validator = validator;
    }

    public boolean registerUser(User user) {
        if (validator.isValid(user)) {
            userRepository.save(user);
            return true;
        }
        return false;
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public boolean updateUser(User updatedUser) {
        if (validator.isValid(updatedUser)) {
            if (userRepository.findById(updatedUser.getId()).isPresent()) {
                ((LocalRepository) userRepository).update(updatedUser);
                return true;
            }
        }
        return false;
    }

    public boolean deleteUser(String id) {
        if (userRepository.findById(id).isPresent()) {
            ((LocalRepository) userRepository).delete(id);
            return true;
        }
        return false;
    }
}