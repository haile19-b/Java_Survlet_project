<%@ page import="java.util.List" %>
<%@ page import="com.example.student.Student" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
    <style>
        table {
            border-collapse: collapse;
            width: 70%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<h2>List of Students</h2>

<table>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Year</th>
    </tr>

    <%
        List<Student> students = (List<Student>) request.getAttribute("students");

        if (students != null) {
            for (Student s : students) {
    %>
    <tr>
        <td><%= s.getName() %></td>
        <td><%= s.getEmail() %></td>
        <td><%= s.getYear() %></td>
    </tr>
    <%
            }
        }
    %>

</table>

</body>
</html>
