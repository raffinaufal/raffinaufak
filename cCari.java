/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P4AgusRonaldo_15010;
import P4AgusRonaldo_15010.eMatKul;
import P4AgusRonaldo_15010.eMhs;
import P4AgusRonaldo_15010.eNilai;
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
public class cCari{ 
    Connection koneksi=null;
    Statement stat=null;
    ResultSet result=null;
    String query=null;
    
    public cCari(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            koneksi = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dB1","dB1");
            stat = koneksi.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
        }
    }
    
    public void tambahmatkul(eMatKul matkul){
        String query = "INSERT INTO T_MATKUL VALUES('"
                +matkul.getid()+ "','"
                +matkul.getnama()+ "')";
       
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }
    }
    
    
    public void ubahmatkul(eMatKul matkul){
        String query="UPDATE t_matkul SET NAMA_MATKUL='"+matkul.getnama()+"' WHERE ID_MATKUL='"+matkul.getid()+"'";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
        }
        
    }
    
    public void hapusmatkul(eMatKul matkul){
        String query="DELETE FROM t_matkul WHERE ID_MATKUL='"+matkul.getid()+"'";
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }
    }
    
    public void tambahmhs(eMhs mhs){
        String query = "INSERT INTO mahasiswa VALUES('"
                +mhs.getid()+ "','"
                +mhs.getalamat()+ "','"
                +mhs.getnama()+ "')";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }
    }
    
    public void ubahmhs(eMhs mhs){
         String query="UPDATE mahasiswa SET NAMA_MHS='"+mhs.getnama()+"', ALAMAT_MHS='"+mhs.getalamat()+"' WHERE ID_MHS='"+mhs.getid()+"'";
         try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah");
        }
    }
         
    public void hapusmhs(eMhs mhs){
        
    String query="DELETE FROM mahasiswa WHERE ID_MHS='"+mhs.getid()+"'";
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }
        
    }
    
    
    
    public void tambahnilai(eNilai nilai){
        
        String query = "INSERT INTO TNILAI VALUES('"
                +nilai.getidmhs()+ "','"
                +nilai.getidmatkul()+"','"
                +nilai.getnilai()+"')";
         try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Tambah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Tambah");
        }
    }
    
    public void ubahnilai(eNilai nilai){
        String query="UPDATE TNILAI SET ID_MATKUL='"+nilai.getidmatkul()+"', NILAI='"+nilai.getnilai()+"' WHERE ID_MHS='"+nilai.getidmhs()+"'";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah");
        }
        
    }
         
  public void hapusnilai(eNilai nilai){
      String query="DELETE FROM TNILAI WHERE ID_MHS='"+nilai.getidmhs()+"'";
      try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }   
  }
    
  
  
    
    
    
    
}
