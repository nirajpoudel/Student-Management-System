/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Unique
 */
class DatabaseConnectivity {

    final static String DB_URL ="jdbc:mysql://localhost:3306/admin";
    final static String USER ="root";
    final static String PASS ="";
    
    public static Connection connection(){
        try{
           
                Connection con =DriverManager.getConnection(DB_URL,USER,PASS);
                return con;
                
    }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
}
    }
