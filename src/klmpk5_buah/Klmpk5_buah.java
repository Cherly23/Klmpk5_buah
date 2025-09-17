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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cherlyMangga buah = new cherlyMangga();
        
        buah.setnama_buah("Mangga");
        System.out.println("Nama Buah    : " + buah.getnama_buah());
        
        buah.setwarna("Hijau / Kuning");
        System.out.println("Warna        : " + buah.getwarna());
        
        buah.setrasa("Manis / Kecut");
        System.out.println("Rasa         : " + buah.getrasa());
        
        buah.setharga(10.000);
        System.out.println("Harga per/kg : " + buah.getharga());
    }
    
}
