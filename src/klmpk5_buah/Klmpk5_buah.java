/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klmpk5_buah;

public class Klmpk5_buah {
    String nama_buah,warna,rasa ;
    double berat, harga ;
    boolean kulit ;
    
    public static void main (String[] args) {
        AZKA_APEL APEL = new AZKA_APEL() ;
        APEL.nama_buah = "APEL" ;
        APEL.warna = "Merah" ;
        APEL.rasa = "Manis dsn sedikit asam " ;
        APEL.harga = 2000 ;
        APEL.berat = 70 ;
        APEL.kulit = true ;
        
        System.out.println("Nama Buah : " + APEL.nama_buah ) ;
        System.out.println("Warna Buah : " + APEL.warna );
        System.out.println("Rasa : " + APEL.rasa ) ;
        System.out.println("Harga : " + APEL.harga ) ;
        System.out.println("Berat : " + APEL.berat ) ;
        System.out.println("Kulit Bisa Dimakan : " + (APEL.kulit ?"Ya" : "Tidak" )) ;
        
    }
        
    }
    

