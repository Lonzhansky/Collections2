package lesson31;

import java.sql.*;
import java.util.*;

public class UserDAO {
    private final Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public User save(User user) throws SQLException {
        if (user == null || !user.isValid()) {
            throw new IllegalArgumentException("Invalid user data");
        }

        String query = "INSERT INTO users (name, email) VALUES (?, ?) RETURNING id;";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user.setId(rs.getLong("id"));
            }
            return user;
        }
    }

    public Optional<User> findByEmail(String email) throws SQLException {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }

        String query = "SELECT * FROM users WHERE email = ?;";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return Optional.of(new User(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("email")
                ));
            }
            return Optional.empty();
        }
    }

    public List<User> findAll() throws SQLException {
        String query = "SELECT * FROM users;";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            List<User> users = new ArrayList<>();
            while (rs.next()) {
                users.add(new User(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("email")
                ));
            }
            return users;
        }
    }

    public void deleteById(Long id) throws SQLException {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }

        String query = "DELETE FROM users WHERE id = ?;";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}