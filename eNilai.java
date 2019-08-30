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
public class eNilai {
   String idmhs,idmatkul;
   int nilai;
   
   public void setidmhs(String idmhs){
       this.idmhs=idmhs;
   }
   public void setidmatkul(String idmatkul){
       this.idmatkul=idmatkul;
   } 
   public void setnilai(int nilai){
       this.nilai=nilai;
   }
   public String getidmhs(){
       return idmhs;
   }
   public String getidmatkul(){
       return idmatkul;
   }
   public int getnilai(){
       return nilai;
   }
}
