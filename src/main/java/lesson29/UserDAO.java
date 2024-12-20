package lesson29;

import java.sql.*;

class UserDAO {

    private static final String URL = "jdbc:postgresql://localhost:5432/lesson29";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";

    public void initializeDatabase() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            Class.forName("org.postgresql.Driver");

            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                    "id SERIAL PRIMARY KEY, " +
                    "name VARCHAR(100), " +
                    "age INTEGER, " +
                    "email VARCHAR(150));";
            statement.execute(createTableSQL);
            System.out.println("Database initialized.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void addUser(User user) {
        String insertSQL = "INSERT INTO users (name, age, email) VALUES (?, ?, ?);";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            if (isValidUser(user)) {
                preparedStatement.setString(1, user.getName());
                preparedStatement.setInt(2, user.getAge());
                preparedStatement.setString(3, user.getEmail());
                preparedStatement.executeUpdate();
                System.out.println("User added successfully.");
            } else {
                System.out.println("Invalid user data. User not added.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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

    public void updateUser(User user) {
        String updateSQL = "UPDATE users SET name = ?, age = ?, email = ? WHERE id = ?;";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {

            if (isValidUser(user)) {
                preparedStatement.setString(1, user.getName());
                preparedStatement.setInt(2, user.getAge());
                preparedStatement.setString(3, user.getEmail());
                preparedStatement.setInt(4, user.getId());
                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println("Rows updated: " + rowsAffected);
            } else {
                System.out.println("Invalid user data. Update failed.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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

    private boolean isValidUser(User user) {
        return user.getName() != null && !user.getName().isEmpty() &&
                user.getAge() > 0 &&
                user.getEmail() != null && user.getEmail().contains("@");
    }
}
