package lesson22.app;

import lesson22.app.model.User;
import lesson22.app.model.UserRole;
import lesson22.app.repository.LocalRepository;
import lesson22.app.service.RegistrationService;
import lesson22.app.validator.UserValidator;

public class Main {
    public static void main(String[] args) {
        var repository = new LocalRepository();
        var validator = new UserValidator();
        var registrationService = new RegistrationService(repository, validator);

        User user1 = new User("1", "Alice", "alice@example.com", UserRole.REGULAR);
        User user2 = new User("2", "Bob", "bob@example.com", UserRole.ADMIN);

        System.out.println("Registering users...");
        registrationService.registerUser(user1);
        registrationService.registerUser(user2);

        System.out.println("\nAll users:");
        registrationService.getAllUsers().forEach(System.out::println);

        System.out.println("\nFinding user with ID '1':");
        registrationService.getUserById("1").ifPresentOrElse(
                System.out::println,
                () -> System.out.println("User not found.")
        );

        System.out.println("\nUpdating Alice to ADMIN...");
        User updatedAlice = new User("1", "Alice", "alice@example.com", UserRole.ADMIN);
        if (registrationService.updateUser(updatedAlice)) {
            System.out.println("User updated successfully.");
        } else {
            System.out.println("Failed to update user.");
        }

        System.out.println("\nDeleting user with ID '2'...");
        if (registrationService.deleteUser("2")) {
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("Failed to delete user.");
        }

        System.out.println("\nAll users after operations:");
        registrationService.getAllUsers().forEach(System.out::println);
    }
}