package lesson22.app.repository.singleton;

import lesson22.app.repository.DatabaseRepository;

public class DatabaseRepositorySingleton {

    private static DatabaseRepository instance;

    private DatabaseRepositorySingleton() {
    }

    public static synchronized DatabaseRepository getInstance() {
        if (instance == null) {
            instance = new DatabaseRepository();
        }
        return instance;
    }
}