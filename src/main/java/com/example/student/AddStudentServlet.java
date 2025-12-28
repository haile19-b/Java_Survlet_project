package com.example.student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/add-student")
public class AddStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        int year = Integer.parseInt(request.getParameter("year"));

        try (Connection conn = DBConnection.getConnection()) {

            String sql = "INSERT INTO students (name, email, year) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, year);

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("addStudent.jsp");
    }
}
