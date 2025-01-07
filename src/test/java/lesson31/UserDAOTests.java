//package lesson31;
//
//import org.junit.jupiter.api.*;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.time.Duration;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class UserDAOTests {
//
//    private static Connection connection;
//    private static UserDAO userDAO;
//    private User tempUser;
//
//    @BeforeAll
//    static void setup() throws SQLException {
//        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "admin");
//        userDAO = new UserDAO(connection);
//        try (Statement stmt = connection.createStatement()) {
//            stmt.execute("CREATE TABLE IF NOT EXISTS users (id SERIAL PRIMARY KEY, name VARCHAR(255), email VARCHAR(255) UNIQUE);");
//        }
//    }
//
//    @AfterAll
//    static void cleanup() throws SQLException {
//        try (Statement stmt = connection.createStatement()) {
//            stmt.execute("DROP TABLE users;");
//        }
//        connection.close();
//    }
//
//    @BeforeEach
//    void beforeEachTest() throws SQLException {
//        tempUser = userDAO.save(new User("Temp User", "temp@example.com"));
//    }
//
//    @AfterEach
//    void afterEachTest() throws SQLException {
//        userDAO.deleteById(tempUser.getId());
//    }
//
//    @Test
//    @Order(1)
//    void testCreateUser() throws SQLException {
//        User user = new User("John Doe", "john.doe@example.com");
//        User savedUser = userDAO.save(user);
//        assertNotNull(savedUser.getId());
//    }
//
//    @Test
//    @Order(2)
//    void testInvalidUserCreation() {
//        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
//            userDAO.save(new User(null, "invalid@example.com"));
//        });
//        assertEquals("Invalid user data", exception.getMessage()); // Перевірка повідомлення
//
//        exception = assertThrows(IllegalArgumentException.class, () -> {
//            userDAO.save(new User("Invalid User", ""));
//        });
//        assertEquals("Invalid user data", exception.getMessage()); // Перевірка повідомлення
//
//        exception = assertThrows(IllegalArgumentException.class, () -> {
//            userDAO.save(null);
//        });
//        assertEquals("Invalid user data", exception.getMessage()); // Перевірка повідомлення
//    }
//
//    @Test
//    @Order(3)
//    void testFindUserByEmail() throws SQLException {
//        Optional<User> user = userDAO.findByEmail(tempUser.getEmail());
//        assertTrue(user.isPresent());
//        assertEquals(tempUser.getName(), user.get().getName());
//    }
//
//    @Test
//    @Order(4)
//    void testFindUserByInvalidEmail() {
//        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
//            userDAO.findByEmail(null);
//        });
//        assertEquals("Email cannot be null or blank", exception.getMessage()); // Перевірка повідомлення
//
//        exception = assertThrows(IllegalArgumentException.class, () -> {
//            userDAO.findByEmail(" ");
//        });
//        assertEquals("Email cannot be null or blank", exception.getMessage()); // Перевірка повідомлення
//    }
//
//    @Test
//    @Order(5)
//    void testListAllUsers() throws SQLException {
//        List<User> users = userDAO.findAll();
//        assertFalse(users.isEmpty());
//    }
//
//    @Test
//    @Order(6)
//    void testDeleteUser() throws SQLException {
//        Optional<User> user = userDAO.findByEmail(tempUser.getEmail());
//        user.ifPresent(value -> {
//            try {
//                userDAO.deleteById(value.getId());
//            } catch (SQLException e) {
//                fail("Deletion failed", e);
//            }
//        });
//        Optional<User> deletedUser = userDAO.findByEmail(tempUser.getEmail());
//        assertFalse(deletedUser.isPresent());
//    }
//
//    @Test
//    @Order(7)
//    void testDeleteWithInvalidId() {
//        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
//            userDAO.deleteById(null);
//        });
//        assertEquals("ID cannot be null", exception.getMessage()); // Перевірка повідомлення
//    }
//
//    @Test
//    void testTimeout() throws SQLException {
//        assertTimeout(Duration.ofSeconds(2), () -> {
//            List<User> users = userDAO.findAll();
//            assertNotNull(users);
//            assertFalse(users.isEmpty());
//        });
//    }
//
//    @DisplayName("Parameterized Test Example")
//    @ParameterizedTest
//    @ValueSource(strings = {"alice@example.com", "bob@example.com"})
//    void testParameterized(String email) throws SQLException {
//        User user = new User(email.split("@")[0], email);
//        userDAO.save(user);
//        Optional<User> fetchedUser = userDAO.findByEmail(email);
//        assertTrue(fetchedUser.isPresent());
//        assertEquals(email, fetchedUser.get().getEmail());
//    }
//}
