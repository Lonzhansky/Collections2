package lesson32.jul.demo_02;

import lesson32.jul.demo_01.JULDemo;

import java.io.IOException;
import java.sql.*;
import java.util.logging.*;

public class UserDAO {

    // Створення логера для класу UserDAO
    private static final Logger logger;

    static {
        try {
            logger = getLogger();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Logger getLogger() throws IOException {
        Logger logger = Logger.getLogger(JULDemo.class.getName());

        // Вимкнення стандартних обробників, щоб уникнути дублювання логів
        logger.setUseParentHandlers(false);

        // Створення обробника для виводу в консоль
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL); // Встановлення рівня логів для обробника
        consoleHandler.setFormatter(new SimpleFormatter()); // Простий формат логів

        // Створення обробника для запису у файл
        FileHandler fileHandler = new FileHandler("demo2.log", false); // Логи додаються у файл
        fileHandler.setLevel(Level.ALL); // Встановлення рівня логів для файлу
        fileHandler.setFormatter(new SimpleFormatter()); // Простий формат логів

        // Додавання обробників до логера
        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);

        // Встановлення рівня логів для логера
        logger.setLevel(Level.ALL);

        return logger;
    }

    public void addUser(User user) {
        String insertUserSQL = "INSERT INTO users(name, age, email) VALUES (?, ?, ?);";
        try (Connection connection = DatabaseInitializer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertUserSQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.setString(3, user.getEmail());

            preparedStatement.executeUpdate();
            logger.info("User added: " + user.getName());
            System.out.println("User added successfully.");

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error adding user: " + user.getName(), e);
        }
    }

    public void viewAllUsers() {
        String selectAllUsersSQL = "SELECT * FROM users;";
        try (Connection connection = DatabaseInitializer.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectAllUsersSQL);

            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("email")
                );
                logger.fine("User found: " + user.getName());
                System.out.println(user);
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error retrieving users.", e);
        }
    }

    public void viewUserById(int id) {
        String selectUserByID = "SELECT * FROM users WHERE id = ?;";
        try (Connection connection = DatabaseInitializer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectUserByID)) {

            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    User user = new User(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("age"),
                            resultSet.getString("email")
                    );
                    logger.fine("User found: " + user.getName());
                    System.out.println(user);
                } else {
                    logger.warning("User with id " + id + " not found.");
                    System.out.println("User with id " + id + " not found.");
                }
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error retrieving user by ID: " + id, e);
        }
    }

    public void updateUser(User user) {
        String updateUserSQL = "UPDATE users SET name = ?, age = ?, email = ? WHERE id = ?;";
        try (Connection connection = DatabaseInitializer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(updateUserSQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setInt(4, user.getId());

            int countRow = preparedStatement.executeUpdate();
            logger.info("User updated: " + user.getName());
            System.out.println("Rows updated: " + countRow);

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error updating user: " + user.getName(), e);
        }
    }

    public void deleteUser(int id) {
        String deleteUserSQL = "DELETE FROM users WHERE id = ?;";
        try (Connection connection = DatabaseInitializer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(deleteUserSQL)) {
            preparedStatement.setInt(1, id);

            int countRow = preparedStatement.executeUpdate();
            logger.info("User deleted with ID: " + id);
            System.out.println("Rows deleted: " + countRow);

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error deleting user with ID: " + id, e);
        }
    }
}