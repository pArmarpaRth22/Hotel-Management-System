/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author hp
 */

import java.sql.*;
import javax.swing.JOptionPane;
public class tables {
    public static void main(String[] args){
        Connection con=null;
        Statement stmt=null;
        try{
            con=ConnectionProvider.getConnection();
            stmt=con.createStatement();
            stmt.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(500),answer varchar(200),address varchar(200),status varchar(20))");
            JOptionPane.showMessageDialog(null, "Table created Successfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                con.close();
                stmt.close();
            }catch(Exception e){
                
            }
        }
        
    }
    
}
