/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klmpk5_buah;

/**
 *
 * @author cherly
 */
public class Klmpk5_buah {
    private String nama;
    private String warna;
    private double berat;

    
    public Klmpk5_buah(String nama, String warna, double berat) {
        this.nama = nama;
        this.warna = warna;
        this.berat = berat;
    }  
    public String getNama(){
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getwarna() {
        return warna;
    }
    public void setwarna(String warna){
        this.warna = warna;
    }
    public double getBerat() {
        return berat;
    }
    public void setberat(double berat) {
        this.berat = berat;
    }
    public void infobuah() {
        System.out.println("Nama: "+ nama+",warna:"+ warna + ",Berat: "+ berat + "kg");
    }
        
    }
    

