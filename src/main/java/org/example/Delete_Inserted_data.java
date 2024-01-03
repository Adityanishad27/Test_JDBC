package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Delete_Inserted_data {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","0000");
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from table1");
            while(rs.next()) {
                System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3));
                //con.close();

            }

        }
        catch(Exception e) {
            System.out.print(e);

        }
    }
    }

