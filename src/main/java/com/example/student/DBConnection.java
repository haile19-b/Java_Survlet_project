package com.example.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
        "MY-DATABASE CONNECTION STRING REMOVED IN ORDER TO PUSH THE CODE!";

    private static final String USER = "USER_NAME";
    private static final String PASSWORD = "PASSWORD";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database connected successfully!");

        } catch (Exception e) {
            System.out.println("❌ Database connection failed!");
            e.printStackTrace();
        }
        return conn;
    }
}