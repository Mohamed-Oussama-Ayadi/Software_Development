package com.example.Connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {
    private static MySQLConnector instance;



    private MySQLConnector(){

    }
    public static MySQLConnector getInstance() {
        if(instance == null){
            instance = new MySQLConnector();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuccina","root","");
        System.out.println("Connected");
        return cn;
    }

}
