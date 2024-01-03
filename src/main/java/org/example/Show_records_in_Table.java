package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class Show_records_in_Table {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Eclipsedb", "root", "0000");
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Eclipsetable");


            // ++++++++++++++ First Method +++++++++++++++++++++
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getInt(2) + "  " + rs.getString(3));
                //con.close();


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}