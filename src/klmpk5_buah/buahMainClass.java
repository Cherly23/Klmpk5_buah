/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klmpk5_buah;

/**
 *
 * @author cherly
 */
public class buahMainClass {
    public static void main(String[] args) {
        AZKA_APEL apel = new AZKA_APEL();
        apel.setnama_buah("Apel Afrika");
        apel.setharga(20000);
        apel.setberat(2);
        apel.setwarna("merah");
        apel.setrasa("Manis");
        apel.setkulit(true);
//        apel.tampil();


        cherlyMangga mgn = new cherlyMangga();
        mgn.setnama_buah("Mangga");
        mgn.setWarna("Kuning");
        mgn.setRasa("Manis");
        mgn.setHarga(30000);
        mgn.setBerat(15.4);
        mgn.setKulit(false);
        mgn.TampilBuah();
     
        
        Cialin_Jeruk jerr = new Cialin_Jeruk();
        jerr.setnama_buah("Jeruk");
        jerr.setwarna("Kuning");
        jerr.setrasa("Manis");
        jerr.setharga(30000);
        jerr.setberat(15.4);
        jerr.setkulit(false);
        
        Toni_Kurma kurma = new Toni_Kurma();
        kurma.setNamaBuah("Kurma");
        kurma.setWarna("Coklat");
        kurma.setRasa("Manis");
        kurma.setHarga(30000);
        kurma.setBerat(15.4);
        kurma.setKulit(false);
        
        Ichul_Manggis manggis = new Ichul_Manggis();
        manggis.setnama_buah("Manggis");
        manggis.setwarna("Ungu");
        manggis.setrasa("Manis");
        manggis.setharga(30000);
        manggis.setberat(15.4);
        manggis.setkulit(false);
        
        Aziz_Nanas nns = new Aziz_Nanas();
        nns.setNama_buah("Nanas");
        nns.setWarna("Kuning");
        nns.setRasa("Manis");
        nns.setHarga(30000);
        nns.setBerat(15.4);
        nns.setKulit(false);
    }
    
    
}
