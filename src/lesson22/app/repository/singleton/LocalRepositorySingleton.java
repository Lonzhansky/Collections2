package lesson22.app.repository.singleton;

import lesson22.app.repository.LocalRepository;

public class LocalRepositorySingleton {

    private static LocalRepository instance;

    private LocalRepositorySingleton() {
    }

    public static synchronized LocalRepository getInstance() {
        if (instance == null) {
            instance = new LocalRepository();
        }
        return instance;
    }
}