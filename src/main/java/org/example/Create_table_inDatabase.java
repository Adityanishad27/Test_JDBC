package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Create_table_inDatabase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EclipseDb","root","0000");
            java.sql.Statement stmt = con.createStatement();
            stmt.executeUpdate("create table EclipseTable(Ename varchar(20),Eid int(10) primary key,Ecity varchar(20))");
            System.out.println("Table Created Successfully");


        }
        catch(Exception e) {
            System.out.print(e);

        }
    }

    }

