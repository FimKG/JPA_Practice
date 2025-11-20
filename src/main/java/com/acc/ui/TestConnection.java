package com.acc.ui;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void mainConn() {
        String url = "jdbc:mysql://localhost:3306/jpa_db";
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!" + (conn != null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
