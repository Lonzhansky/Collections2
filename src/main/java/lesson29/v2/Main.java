package lesson29.v2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ініціалізація бази даних
        DatabaseInitializer.initializeDatabase();

        // Створення об'єктів для роботи з користувачами та замовленнями
        UserDAO userDAO = new UserDAO();
        OrderDAO orderDAO = new OrderDAO();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nDatabase Menu:");
            System.out.println("1. Add User");
            System.out.println("2. View All Users");
            System.out.println("3. View User by ID");
            System.out.println("4. Update User");
            System.out.println("5. Delete User");
            System.out.println("6. Add Order");
            System.out.println("7. View All Orders");
            System.out.println("8. Delete Order");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Додавання користувача
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    userDAO.addUser(new User(0, name, age, email));
                    break;

                case 2:
                    // Перегляд усіх користувачів
                    userDAO.viewAllUsers();
                    break;

                case 3:
                    // Перегляд користувача за ID
                    System.out.print("Enter user ID: ");
                    int userId = scanner.nextInt();
                    userDAO.viewUserById(userId);
                    break;

                case 4:
                    // Оновлення інформації про користувача
                    System.out.print("Enter user ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    userDAO.updateUser(new User(updateId, newName, newAge, newEmail));
                    break;

                case 5:
                    // Видалення користувача
                    System.out.print("Enter user ID to delete: ");
                    int deleteUserId = scanner.nextInt();
                    userDAO.deleteUser(deleteUserId);
                    break;

                case 6:
                    // Додавання замовлення
                    System.out.print("Enter user ID for the order: ");
                    int userIdForOrder = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    orderDAO.addOrder(new Order(0, userIdForOrder, productName, quantity, price));
                    break;

                case 7:
                    // Перегляд усіх замовлень
                    orderDAO.viewAllOrders();
                    break;

                case 8:
                    // Видалення замовлення
                    System.out.print("Enter order ID to delete: ");
                    int deleteOrderId = scanner.nextInt();
                    orderDAO.deleteOrder(deleteOrderId);
                    break;

                case 9:
                    // Вихід з програми
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();  // Закриття сканера
    }
}