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


    public static void main(String[] args) {
    Aziz_Nanas Nanas = new Aziz_Nanas();
    Nanas.Nama_buah = "Nanas";
    Nanas.Warna = "Kuning Keemasan";
    Nanas.Rasa = "Manis dan Asam Segar";
    Nanas.Harga = 30000;
    Nanas.Berat = 1;
    Nanas.kulit = false;
    
    System.out.println("Nama Buah : " + Nanas.Nama_buah);
    System.out.println("Warna Buah :" + Nanas.Warna);
    System.out.println("Rasa : " + Nanas.Rasa);
    System.out.println("Harga Buah Perkilo : " + Nanas.Harga);
    System.out.println("Berat perbuah : " + Nanas.Berat);
    System.out.println("Kulit Bisa Dimakan : " + (Nanas.kulit ? "ya" : "Tidak" ));
    }
    
}
