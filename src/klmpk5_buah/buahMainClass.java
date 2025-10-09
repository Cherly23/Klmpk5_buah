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
        apel.setHarga(20000);
        apel.setBerat(2);
        apel.setWarna("merah");
        apel.setRasa("Manis");
        apel.setKulit(true);
//        apel.tampil();
        
        Cialin_Jeruk jeruk = new Cialin_Jeruk();
        
        
        Toni_Kurma kurma = new Toni_Kurma();
        
        
        Manggis manggis = new Manggis();
    }
}
