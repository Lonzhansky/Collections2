package lesson22.app.observer;

import lesson22.app.model.User;

public class AuditService implements UserObserver {

    @Override
    public void update(User user) {
        System.out.println("AuditService: Logging user update: " + user);
    }
}