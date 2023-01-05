package org.example.solid.single_respondibility.employee_architecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManagement {
    private Connection connection;

    private static DatabaseConnectionManagement connectionManagement = new DatabaseConnectionManagement();

    public DatabaseConnectionManagement() {
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("Database URL");
        System.out.println("Connection to DB established");
    }

    public Connection getConnection() {
        return connection;
    }

    public void disconnect() throws SQLException {
        connection.close();
        System.out.println("Disconnected from DB");
    }
}
