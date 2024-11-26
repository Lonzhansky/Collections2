package lesson22.app.repository.factory;

import lesson22.app.repository.Repository;
import lesson22.app.repository.singleton.DatabaseRepositorySingleton;
import lesson22.app.repository.singleton.LocalRepositorySingleton;

public class RepositoryFactory {

    public static Repository<?> getRepository(String type) {
        return switch (type.toLowerCase()) {
            case "-local" -> LocalRepositorySingleton.getInstance();
            case "-db" -> DatabaseRepositorySingleton.getInstance();
            default -> throw new IllegalArgumentException("Unknown repository type: " + type);
        };
    }
}