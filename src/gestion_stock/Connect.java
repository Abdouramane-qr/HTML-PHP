/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_stock;

import java.sql.*;

/**
 *
 * @author Abdouramane
 */
public class Connect {
    String url="jdbc:mysql://localhost:3306/gestionstock";
    String usr="root";
    String pwd="";
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionstock", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
   
    
    

       
    }
}
