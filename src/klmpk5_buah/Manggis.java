/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klmpk5_buah;

/**
 *
 * @author HP
 */
public class Manggis {
        public static void main(String[] args) {
        Ichul_Manggis Manggis = new Ichul_Manggis();
        Manggis.nama_buah = "Manggis";
        Manggis.warna = "Ungu tua";
        Manggis.rasa = "Manis dan tidak terlalu asam";
        Manggis.harga = 30000;
        Manggis.berat = 80;
        Manggis.kulit = false ;
                
        System.out.println("Nama Buah : " + Manggis.nama_buah);
        System.out.println("Warna Buah : " + Manggis.warna);
        System.out.println("Rasa : " + Manggis.rasa);
        System.out.println("Harga Buah perkilo : " + Manggis.harga + " Rupiah");
        System.out.println("Berat perbuah : " + Manggis.berat + " gram");
        System.out.println("Kulit bisa dimakan  : " + (Manggis.kulit ? "Ya" : "Tidak"));
        }
    
}
