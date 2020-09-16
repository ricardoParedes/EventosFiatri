/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDAO {
    
    static Connection cn = null;
   
    public static Connection getConnection() {
        String url="jdbc:sqlserver://DESKTOP-MKTO0TM:1433;databaseName=EventosFiatri";
        try{
            Class.forName("com.microsft.sqlserver.jdbc.SQLServerDriver");
            
            
            
         }catch (ClassNotFoundException e){
            //JOptionPane.showMessageDialog(null, "No se pudeo establecer conexion.. revisar Driver"+e.getMessage(),
           // "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }try {
            cn= DriverManager.getConnection(url, "bases", "1234");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage(),
            "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        
    return cn;
    }
   
}
