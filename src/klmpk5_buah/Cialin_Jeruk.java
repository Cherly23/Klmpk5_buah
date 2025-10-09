/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klmpk5_buah;

/**
 *
 * @author ThinkPad
 */
public class Cialin_Jeruk extends BuahClass{
    String nama_buah;
    
    public  void  setnama_buah(String nb){
        this.nama_buah = nb;
    }
    
    public String getnama_buah(){
        return this.nama_buah;
    }
    public void  tampil1(){
        System.out.println("Nama Buah \t   : " + this.nama_buah);
        System.out.println("Rasa Buah \t   : " + super.rasa);
        System.out.println("Warna Buah \t   : " + super.warna);
        System.out.println("Harga Buah \t   : " + super.harga);
        System.out.println("Berat Buah \t   : " + super.berat);
        System.out.println("Kulit Bisa dimakan : " + super.kulit);
    }
    }
