package org.example;

import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dede");
        req.getRequestDispatcher("/signUp.jsp").forward(req,resp);
    }

    @Override
    @SneakyThrows
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dede");
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/sem",
                "postgres","uhb,");
        PreparedStatement preparedStatement =
                connection.prepareStatement("INSERT INTO users(name,surname,login,password) " +
                        "VALUES (?,?,?,?) ");


        preparedStatement.setString(1,name);
        preparedStatement.setString(2,surname);
        preparedStatement.setString(3,login);
        preparedStatement.setString(4,password);

        preparedStatement.executeUpdate();
        connection.commit();
        System.out.println(name + " " + surname);
        connection.close();
        req.getRequestDispatcher("signIn");



    }

}
