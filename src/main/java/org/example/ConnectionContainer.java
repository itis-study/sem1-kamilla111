package org.example;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionContainer {
    private static Connection connection;

    @SneakyThrows
    public  static Connection getConnection(){
        if (connection == null){
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/sem",
                    "postgres","uhb,");
            return connection;
        } else {
            return connection;
        }
    }
}