package lesson29.v2;

import java.sql.*;

public class UserDAO {
    private static final String URL = "jdbc:postgresql://localhost:5432/lesson29";
    private static final String USER = "postgres";  // Замініть на ваш логін
    private static final String PASSWORD = "admin";  // Замініть на ваш пароль

    // Додавання користувача
    public void addUser(User user) {
        String insertSQL = "INSERT INTO users (name, age, email) VALUES (?, ?, ?);";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.executeUpdate();
            System.out.println("User added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Перегляд усіх користувачів
    public void viewAllUsers() {
        String selectAllSQL = "SELECT * FROM users;";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectAllSQL)) {
            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("email")
                );
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Перегляд користувача за ID
    public void viewUserById(int id) {
        String selectByIdSQL = "SELECT * FROM users WHERE id = ?;";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(selectByIdSQL)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    User user = new User(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("age"),
                            resultSet.getString("email")
                    );
                    System.out.println(user);
                } else {
                    System.out.println("User with ID " + id + " not found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Оновлення інформації про користувача
    public void updateUser(User user) {
        String updateSQL = "UPDATE users SET name = ?, age = ?, email = ? WHERE id = ?;";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setInt(4, user.getId());
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows updated: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Видалення користувача
    public void deleteUser(int id) {
        String deleteSQL = "DELETE FROM users WHERE id = ?;";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows deleted: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}