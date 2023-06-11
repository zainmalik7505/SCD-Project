/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bse203147_bse203158;
import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author zainm
 */
public class DBconnection {
    static final String DB_URL = "jdbc:mysql://localhost:3307/scd";
    static final String USER = "root";
    static final String PASS = "";

    public static Connection connectDB() {
        Connection con = null;

        try {
            // Uncomment the following line if necessary
 
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            return con;
        } catch (Exception ex) {
            // Log or handle the exception appropriately
            ex.printStackTrace();
            System.out.println("There is an error while connecting with the database");
            return null;
        }
    }
}
 






