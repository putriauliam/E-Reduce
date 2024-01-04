/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.reduce;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Koneksi {
    
     private static Connection mysqlkonek;
     public static Connection koneksiDB() throws SQLException {
     if (mysqlkonek==null){
            try {
                String DB= "jdbc:MySQL://localhost:3306/java_users_db";
                String user="root";
                String pass="";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                mysqlkonek=(Connection) DriverManager.getConnection(DB,user,pass);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        } return mysqlkonek;
}
}

