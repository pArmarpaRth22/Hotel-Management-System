/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;
import javax.swing.JOptionPane;
public class InsertupdateDelete {
    public static void setData(String query,String msg){
           Connection con=null;
        Statement stmt=null;
        try{
            con=ConnectionProvider.getConnection();
            stmt=con.createStatement();
            stmt.executeUpdate(query);
            if(!msg.equals("")){
                JOptionPane.showMessageDialog(null, msg);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                
            }
            catch(Exception e){
                
            }
        }
}
}

