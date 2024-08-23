
package project;

import java.sql.*;
public class ConnectionProvider {
    public static Connection getConnection() throws SQLException{
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","parth");
           return con;
       } catch(ClassNotFoundException e){
           System.out.println(e);
           return null;
           
       }
        
    }
}
