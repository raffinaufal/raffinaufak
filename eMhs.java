/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P4AgusRonaldo_15010;

/**
 *
 * @author Agus Ronaldo
 */
public class eMhs {
    String idmhs,nama,alamat;
    
    public void setidmhs(String id){
        idmhs=id;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public void setalamat(String alamat){
        this.alamat=alamat;
    }
    public String getid(){
        return idmhs;
    }
    public String getnama(){
        return nama;
    }
    public String getalamat(){
        return alamat;
    }
}
