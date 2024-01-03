package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public   class CREATE_DATABASE {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "0000");
            java.sql.Statement stmt = con.createStatement();
            stmt.executeUpdate("create database EclipseDb");
            System.out.println("Database Created Successfully");


        } catch (Exception e) {
            System.out.print(e);

        }

    }
}

