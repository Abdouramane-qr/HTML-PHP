/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_stock;

import gestion_stock.menu.FormulaireInscription;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class GESTION_STOCK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionstock","root","");
            PreparedStatement ps = con.prepareStatement("SELECT *FROM ARTICLE");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
            System.out.println(rs.getInt("IDART")+ "\t"+ rs.getString("NOMART")+ "\t"+ rs.getInt("STOCKMINI")+ "\t"+ rs.getInt("STOCKMAX"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GESTION_STOCK.class.getName()).log(Level.SEVERE, null, ex);
        }
    FormulaireInscription fi=new  FormulaireInscription();
    fi.setVisible(true);
    }
    
}
