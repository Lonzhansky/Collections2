package lesson22.app.observer;

import lesson22.app.model.User;

public interface UserSubject {
    void addObserver(UserObserver observer);
    void removeObserver(UserObserver observer);
    void notifyObservers(User user);
}