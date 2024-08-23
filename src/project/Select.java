/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class Select {
    public static ResultSet getData(String query){
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        
        try{
            con=ConnectionProvider.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            return rs;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    
}
