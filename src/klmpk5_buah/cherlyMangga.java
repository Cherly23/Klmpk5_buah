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
    double harga;
    
    public void setnama_buah(String nb){
        this.nama_buah = nb;
    }
    public String getnama_buah(){
        return this.nama_buah;
    }
    
    public void setwarna(String wrn){
        this.warna = wrn;
    }
    public String getwarna(){
        return this.warna;
    }
    
    public void setrasa(String rs){
        this.rasa = rs;
    }
    public String getrasa(){
        return this.rasa;
    }
    
    public void setharga(double hrg){
        this.harga = hrg;
    }
    public double getharga(){
        return this.harga;
    }
    
}
