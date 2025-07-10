package com.austin.pizzaorder.util;

import com.austin.pizzaorder.dao.DBConnector;
import java.sql.Connection;
import java.sql.SQLException;

public class DBValidator {

    public static boolean testConnection() {
        try (Connection conn = DBConnector.getConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("Connection to database successful.");
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database.");
            e.printStackTrace();
        }
        return false;
    }
}

