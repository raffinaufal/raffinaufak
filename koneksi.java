/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P4AgusRonaldo_15010;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Agus Ronaldo
 */
public class koneksi {
    
    private static Connection conn;
    private static Statement stt;
    private ResultSet res;
    
    public static Connection getConnection(){
        if (conn==null){
            try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dB1","dB1");
            stt = conn.createStatement();
                System.out.println("KONEKSI SUKSES");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            }
            
        }
        return conn;
    }
    public static void main(String[] args) {
        getConnection();
    }
}
