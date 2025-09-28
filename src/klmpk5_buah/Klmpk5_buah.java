/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klmpk5_buah;

public class Klmpk5_buah {
    public static void main(String[] args) {
        // TODO code application logic here
        Cialin_Jeruk jeruk = new Cialin_Jeruk();
        jeruk.nama_buah = "Jeruk";
        jeruk.warna = "Kuning";
        jeruk.rasa = "Manis dan Asam";
        jeruk.harga = 20000;
        jeruk.berat = 1;
        jeruk.kulit = false ;
        
        System.out.println("=====================================================");
        System.out.println("                      DATA BUAH");
        System.out.println("=====================================================");
        
        jeruk.setnama_buah("Jeruk");
        System.out.println("Nama Buah\t\t: " + jeruk.getnama_buah());
        
        jeruk.setwarna("Kuning");
        System.out.println("Warna buah\t\t: " + jeruk.getwarna());
        
        jeruk.setrasa("Manis dan Asam");
        System.out.println("Rasa buah\t\t: " + jeruk.getrasa());
        
        jeruk.setharga(20.000);
        System.out.println("Harga buah per kilo\t: " + jeruk.getharga());
        
        jeruk.setberat(1);
        System.out.println("Berat buah per kilo\t: " + jeruk.getberat());
        
        jeruk.setkulit(false);
        System.out.println("kulit bisa dimakan?\t: " + (jeruk.kulit ? "Ya" : "Tidak"));
        
        System.out.println("=====================================================");
    }
    }
