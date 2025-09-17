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
        buah.setwarna("Hijau / Kuning");
        buah.setrasa("Manis / Kecut");
        buah.setharga(10.000);
        buah.setberat(5.6);
        buah.setkulit(false);
        
        System.out.println("Nama Buah            : " + buah.getnama_buah());
        System.out.println("Warna                : " + buah.getwarna());
        System.out.println("Rasa                 : " + buah.getrasa());
        System.out.println("Berat Buah           : " + buah.getberat());
        System.out.println("Harga per/kg         : " + buah.getharga());
        System.out.println("Kulit Dapat Dimakan  : " + buah.getkulit());
    }
    
}
