/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexao {
    private static final String url = "jdbc:mysql://localhost:3306/sistemaemprestimos";
    private static final String user = "root";
    private static final String password = "252426";
    
    private static Connection conn; 
            
    public static Connection getConnection() throws SQLException{
        try {
        if (conn == null){
                conn = DriverManager.getConnection(url, user, password);
                return conn;
          } 
            else{
             return conn;
            }
         }
        
        catch (SQLException e){
             e.printStackTrace();
             return null;
               }
             
    
     }
  }
