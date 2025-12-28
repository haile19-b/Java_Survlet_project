package com.example.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
        "jdbc:mysql://mysql-3a2703a4-yesexample972-d326.i.aivencloud.com:18606/defaultdb?useSSL=true&requireSSL=true&verifyServerCertificate=false";

    private static final String USER = "avnadmin";
    private static final String PASSWORD = "AVNS_iR9-k9dCl2uCV1sO9uI";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database connected successfully!");

        } catch (Exception e) {
            System.out.println("❌ Database connection failed!");
            e.printStackTrace();
        }
        return conn;
    }
}