package lesson30;


import lesson30.dao.*;
import lesson30.entity.*;
import lesson30.util.HibernateUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        OrderDAO orderDAO = new OrderDAO();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nDatabase Menu");
            System.out.println("1. Add user");
            System.out.println("2. View All Users");
            System.out.println("3. View User by ID");
            System.out.println("4. Update User");
            System.out.println("5. Delete User");
            System.out.println("6. Add Order");
            System.out.println("7. View All Orders");
            System.out.println("8. Delete Order");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    userDAO.addUser(new User(name, age, email));
                }
                case 2 -> userDAO.getAllUsers().forEach(System.out::println);
                case 3 -> {
                    System.out.print("Enter user ID: ");
                    int id = scanner.nextInt();
                    System.out.println(userDAO.getUserById(id));
                }
                case 4 -> {
                    System.out.print("Enter user ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String email = scanner.nextLine();
                    User user = new User(name, age, email);
                    user.setId(id);
                    userDAO.updateUser(user);
                }
                case 5 -> {
                    System.out.print("Enter user ID to delete: ");
                    int id = scanner.nextInt();
                    userDAO.deleteUser(id);
                }
                case 6 -> {
                    System.out.print("Enter user ID for the order: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    User user = userDAO.getUserById(userId);
                    if (user != null) {
                        orderDAO.addOrder(new Order(user, productName, quantity, price));
                    } else {
                        System.out.println("User not found.");
                    }
                }
                case 7 -> orderDAO.getAllOrders().forEach(System.out::println);
                case 8 -> {
                    System.out.print("Enter order ID to delete: ");
                    int id = scanner.nextInt();
                    orderDAO.deleteOrder(id);
                }
                case 0 -> exit = true;
                default -> System.out.println("Invalid choice.");
            }
        }

        HibernateUtil.shutdown();
    }
}
