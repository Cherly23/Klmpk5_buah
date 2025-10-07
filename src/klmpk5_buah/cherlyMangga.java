 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klmpk5_buah;


public class cherlyMangga extends Buah_Class {
    String nama_buah;
    
    public void setnama_buah(String nb){
        this.nama_buah = nb;  
    }
    
    
    public String getnama_buah(){
        return this.nama_buah; 
    }
    
    public void TampilBuah (){
        System.out.println("Nama Buah          : " + this.nama_buah);
        System.out.println("Rasa Buah          : " + super.rasa);
        System.out.println("Warna Buah         : " + super.warna);
        System.out.println("Harga Buah         : " + super.harga);
        System.out.println("Berat Buah         : " + super.berat);
        System.out.println("Kulit Bisa Dimakan : " + super.kulit);
    }
    
}
