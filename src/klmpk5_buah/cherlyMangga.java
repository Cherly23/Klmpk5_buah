/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klmpk5_buah;

/**
 *
 * @author cherly
 */
public class cherlyMangga {
    String nama_buah, warna, rasa;
    double harga, berat;
    boolean kulit;
    
    public void setnama_buah(String nb){
        this.nama_buah = nb;  
    }
    public void setwarna(String wrn){
        this.warna = wrn;  
    }
    public void setrasa(String rs){
        this.rasa = rs;  
    }
    public void setharga(double hrg){
        this.harga = hrg; 
    }
    public void setberat(double brt){
        this.berat = brt;
    }
    public void setkulit(boolean klt){
        this.kulit = klt;
    }
    
    
    
    
    public String getnama_buah(){
        return this.nama_buah;
    }
    public String getwarna(){
        return this.warna;
    } 
    public String getrasa(){
        return this.rasa;
    }
    public double getharga(){
        return this.harga;
    }
    public boolean getkulit(){
        return this.kulit;
    }
    public double getberat() {
        return this.berat;
    }
    
    
    
}
