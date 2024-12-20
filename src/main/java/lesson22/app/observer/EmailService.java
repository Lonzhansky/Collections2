package lesson22.app.observer;

import lesson22.app.model.User;

public class EmailService implements UserObserver {

    @Override
    public void update(User user) {
        System.out.println("EmailService: Sending notification about user update: " + user);
    }
}