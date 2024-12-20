package lesson22.app.service;

import lesson22.app.model.User;
import lesson22.app.observer.UserObserver;
import lesson22.app.observer.UserSubject;
import lesson22.app.repository.Repository;
import lesson22.app.repository.LocalRepository;
import lesson22.app.validator.context.UserValidatorContext;
import lesson22.app.validator.strategy.RegistrationValidationStrategy;
import lesson22.app.validator.strategy.UpdateValidationStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegistrationService implements UserSubject {
    private final Repository<User> userRepository;
    private final UserValidatorContext validatorContext;
    private final List<UserObserver> observers = new ArrayList<>();

    public RegistrationService(Repository<User> userRepository) {
        this.userRepository = userRepository;
        this.validatorContext = new UserValidatorContext();
    }

    public boolean registerUser(User user) {
        validatorContext.setStrategy(new RegistrationValidationStrategy());
        if (validatorContext.validate(user)) {
            userRepository.save(user);
            notifyObservers(user);
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
        validatorContext.setStrategy(new UpdateValidationStrategy());
        if (validatorContext.validate(updatedUser)) {
            if (userRepository.findById(updatedUser.getId()).isPresent()) {
                ((LocalRepository) userRepository).update(updatedUser);
                notifyObservers(updatedUser);
                return true;
            }
        }
        return false;
    }

    public boolean deleteUser(String id) {
        if (userRepository.findById(id).isPresent()) {
            ((LocalRepository) userRepository).delete(id);
            notifyObservers(new User(id, null, null, null));
            return true;
        }
        return false;
    }

    @Override
    public void addObserver(UserObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(UserObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(User user) {
        for (UserObserver observer : observers) {
            observer.update(user);
        }
    }
}