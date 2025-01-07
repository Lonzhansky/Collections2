package lesson32.jul.demo_02;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseInitializer {

    // Логер для логування
    private static final Logger logger = Logger.getLogger(DatabaseInitializer.class.getName());

    public static void initializeDatabase() {
        try (Connection connection = DriverManager.getConnection(DBProperties.URL, DBProperties.USER, DBProperties.PASSWORD);
             Statement statement = connection.createStatement()) {

            Class.forName("org.postgresql.Driver");

            logger.info("Database initialization started.");

            String createUserTableSQL = "CREATE TABLE IF NOT EXISTS users(" +
                    "id SERIAL PRIMARY KEY, " +
                    "name VARCHAR(100)," +
                    "age INTEGER, " +
                    "email VARCHAR(150));";
            statement.execute(createUserTableSQL);
            logger.info("Users table created or already exists.");

            String createOrderTableSQL = "CREATE TABLE IF NOT EXISTS orders(" +
                    "id SERIAL PRIMARY KEY, " +
                    "user_id INTEGER, " +
                    "product_name VARCHAR(100)," +
                    "quantity INTEGER, " +
                    "price DECIMAL, " +
                    "CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE);";
            statement.execute(createOrderTableSQL);
            logger.info("Orders table created or already exists.");

            String createUserOrderViewSQL = "CREATE OR REPLACE VIEW user_order_view AS " +
                    "SELECT o.id AS order_id, " +
                    "o.product_name, " +
                    "o.quantity, " +
                    "o.price, " +
                    "u.id AS user_id, " +
                    "u.name AS user_name, " +
                    "u.age AS user_age, " +
                    "u.email AS user_email " +
                    "FROM orders o " +
                    "INNER JOIN users u ON o.user_id = u.id;";
            statement.execute(createUserOrderViewSQL);
            logger.info("User order view created or already exists.");

            System.out.println("Database initialized.");

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Database initialization failed: " + e.getMessage(), e);
        } catch (ClassNotFoundException e) {
            logger.log(Level.SEVERE, "PostgreSQL driver not found: " + e.getMessage(), e);
        }
    }

    public static Connection getConnection() throws SQLException {
        logger.fine("Getting database connection.");
        return DriverManager.getConnection(DBProperties.URL, DBProperties.USER, DBProperties.PASSWORD);
    }
}