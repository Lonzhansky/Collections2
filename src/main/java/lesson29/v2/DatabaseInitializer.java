package lesson29.v2;

import java.sql.*;

public class DatabaseInitializer {

    private static final String URL = "jdbc:postgresql://localhost:5432/lesson29";
    private static final String USER = "postgres";  // Замініть на ваш логін
    private static final String PASSWORD = "admin";  // Замініть на ваш пароль

    // Метод для ініціалізації бази даних
    public static void initializeDatabase() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            // Завантаження драйвера PostgreSQL
            Class.forName("org.postgresql.Driver");

            // Створення таблиці користувачів, якщо вона не існує
            String createUsersTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                    "id SERIAL PRIMARY KEY, " +  // Створюємо стовпець id з автоінкрементом
                    "name VARCHAR(100), " +  // Створюємо стовпець name для імені користувача
                    "age INTEGER, " +  // Створюємо стовпець age для віку користувача
                    "email VARCHAR(150));";  // Створюємо стовпець email для електронної пошти
            statement.execute(createUsersTableSQL);  // Виконання SQL для створення таблиці users

            // Створення таблиці замовлень з зовнішнім ключем на таблицю users
            String createOrdersTableSQL = "CREATE TABLE IF NOT EXISTS orders (" +
                    "id SERIAL PRIMARY KEY, " +  // Створюємо стовпець id для замовлення
                    "user_id INTEGER, " +  // Створюємо стовпець user_id, що буде зовнішнім ключем
                    "product_name VARCHAR(100), " +  // Створюємо стовпець product_name для назви продукту
                    "quantity INTEGER, " +  // Створюємо стовпець quantity для кількості продукту
                    "price DECIMAL, " +  // Створюємо стовпець price для ціни продукту
                    "CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE);";  // Створюємо обмеження зовнішнього ключа
            statement.execute(createOrdersTableSQL);  // Виконання SQL для створення таблиці orders

            // Створення VIEW для перегляду замовлень разом з інформацією про користувача
            String createUserOrdersViewSQL = "CREATE OR REPLACE VIEW user_orders_view AS " +
                    "SELECT o.id AS order_id, " +  // Вибірка id замовлення
                    "o.product_name, " +  // Вибірка назви продукту
                    "o.quantity, " +  // Вибірка кількості продукту
                    "o.price, " +  // Вибірка ціни продукту
                    "u.id AS user_id, " +  // Вибірка id користувача
                    "u.name AS user_name, " +  // Вибірка імені користувача
                    "u.age AS user_age, " +  // Вибірка віку користувача
                    "u.email AS user_email " +  // Вибірка email користувача
                    "FROM orders o " +  // З таблиці orders
                    "JOIN users u ON o.user_id = u.id;";  // З'єднуємо з таблицею users по user_id
            statement.execute(createUserOrdersViewSQL);  // Виконання SQL для створення VIEW

            System.out.println("Database initialized.");  // Повідомлення про успішну ініціалізацію бази даних
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();  // Виведення помилок, якщо вони виникли
        }
    }
}