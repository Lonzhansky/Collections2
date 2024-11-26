package lesson22.app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lesson22.app.model.User;

public class DatabaseRepository implements Repository<User> {

    private final List<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public Optional<User> findById(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }
}