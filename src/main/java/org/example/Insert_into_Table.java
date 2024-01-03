package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_into_Table {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EclipseDb", "root", "0000");
            PreparedStatement psmt = con.prepareStatement("insert into Eclipsetable value(?,?,?)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.print("Enter Ename:");

                String Ename = br.readLine();

                System.out.print("Enter EId:");
                int Eid = Integer.parseInt(br.readLine());


                System.out.print("Enter ECity:");
                String Ecity = br.readLine();


                psmt.setString(1, Ename);
                psmt.setInt(2, Eid);
                psmt.setString(3, Ecity);
                int count = psmt.executeUpdate();
                if (count > 0)
                    System.out.print(count + "record Inserted ");
                else
                    System.out.print("No record Inserted");

                System.out.print("Do You want to Insert more record[yes/No] ");

                String ch = br.readLine();
                if (ch.equalsIgnoreCase("No"))
                    System.out.print(" Thank You ");
                break;
            }

        } catch (Exception e) {
            System.out.print(e);

        }
    }
}
