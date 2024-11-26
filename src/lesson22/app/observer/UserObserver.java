package lesson22.app.observer;


import lesson22.app.model.User;

public interface UserObserver {
    void update(User user);
}