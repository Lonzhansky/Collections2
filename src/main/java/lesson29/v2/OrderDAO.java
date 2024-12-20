package lesson29.v2;

import java.sql.*;

public class OrderDAO {
    private static final String URL = "jdbc:postgresql://localhost:5432/lesson29";
    private static final String USER = "postgres";  // Замініть на ваш логін
    private static final String PASSWORD = "admin";  // Замініть на ваш пароль

    // Додавання замовлення
    public void addOrder(Order order) {
        String insertSQL = "INSERT INTO orders (user_id, product_name, quantity, price) VALUES (?, ?, ?, ?);";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setInt(1, order.getUserId());
            preparedStatement.setString(2, order.getProductName());
            preparedStatement.setInt(3, order.getQuantity());
            preparedStatement.setDouble(4, order.getPrice());
            preparedStatement.executeUpdate();
            System.out.println("Order added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Перегляд усіх замовлень
    public void viewAllOrders() {
        String selectAllSQL = "SELECT * FROM user_orders_view;";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectAllSQL)) {
            while (resultSet.next()) {
                System.out.println("Order ID: " + resultSet.getInt("order_id"));
                System.out.println("Product Name: " + resultSet.getString("product_name"));
                System.out.println("Quantity: " + resultSet.getInt("quantity"));
                System.out.println("Price: " + resultSet.getDouble("price"));
                System.out.println("User ID: " + resultSet.getInt("user_id"));
                System.out.println("User Name: " + resultSet.getString("user_name"));
                System.out.println("User Age: " + resultSet.getInt("user_age"));
                System.out.println("User Email: " + resultSet.getString("user_email"));
                System.out.println("-----------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Видалення замовлення
    public void deleteOrder(int id) {
        String deleteSQL = "DELETE FROM orders WHERE id = ?;";
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