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
        // TODO code application logic here
        cherlyMangga buah = new cherlyMangga();
        
        buah.setnama_buah("Mangga");
        buah.setwarna("Hijau");
        buah.setrasa("Manis");
        buah.setharga(8000);
        buah.setberat(5.6);
        buah.setkulit(false);
        
        System.out.println("=============== MANGGA ===============");
        System.out.println("Nama Buah            : " + buah.getnama_buah());
        System.out.println("Warna                : " + buah.getwarna());
        System.out.println("Rasa                 : " + buah.getrasa());
        System.out.println("Berat Buah           : " + buah.getberat() + " Kg");
        System.out.println("Harga per/kg         : Rp." + buah.getharga());
        System.out.println("Kulit Bisa Dimakan   : " + (buah.kulit? "Ya" : "Tidak"));
        
        Aziz_Nanas nns = new Aziz_Nanas();
        
        nns.setNama_buah("Nanas");
        nns.setWarna("Kuning");
        nns.setRasa("Manis");
        nns.setHarga(10000);
        nns.setBerat(8.6);
        nns.setKulit(false);
        
        System.out.println("\n=============== NANAS ================");
        System.out.println("Nama Buah            : " + nns.getNama_buah());
        System.out.println("Warna                : " + nns.getWarna());
        System.out.println("Rasa                 : " + nns.getRasa());
        System.out.println("Berat Buah           : " + nns.getBerat() + " Kg");
        System.out.println("Harga per/kg         : Rp." + nns.getHarga());
        System.out.println("Kulit Bisa Dimakan   : " + (nns.kulit? "Ya" : "Tidak"));
        
        Toni_Kurma krm = new Toni_Kurma();
        
        krm.setNamaBuah("Kurma");
        krm.setWarna("Coklat Tua");
        krm.setRasa("Manis");
        krm.setHarga(5000);
        krm.setBerat(2.3);
        krm.setKulit(true);
        
        System.out.println("\n=============== KURMA ================");
        System.out.println("Nama Buah            : " + krm.getNamaBuah());
        System.out.println("Warna                : " + krm.getWarna());
        System.out.println("Rasa                 : " + krm.getRasa());
        System.out.println("Berat Buah           : " + krm.getBerat() + " Kg");
        System.out.println("Harga per/kg         : Rp." + krm.getHarga());
        System.out.println("Kulit Bisa Dimakan   : " + (krm.kulit? "Ya" : "Tidak"));
        
        Cialin_Jeruk jrk = new Cialin_Jeruk();
        
        jrk.setnama_buah("Jeruk");
        jrk.setwarna("Kuning");
        jrk.setrasa("Manis");
        jrk.setharga(7000);
        jrk.setberat(3.4);
        jrk.setkulit(false);
        
        System.out.println("\n=============== JERUK ================");
        System.out.println("Nama Buah            : " + jrk.getnama_buah());
        System.out.println("Warna                : " + jrk.getwarna());
        System.out.println("Rasa                 : " + jrk.getrasa());
        System.out.println("Berat Buah           : " + jrk.getberat() + " Kg");
        System.out.println("Harga per/kg         : Rp." + jrk.getharga());
        System.out.println("Kulit Bisa Dimakan   : " + (jrk.kulit? "Ya" : "Tidak"));
        
        Ichul_Manggis mgs = new Ichul_Manggis();
        
        mgs.setnama_buah("Manggis");
        mgs.setwarna("Ungu");
        mgs.setrasa("Manis");
        mgs.setharga(12000);
        mgs.setberat(7.2);
        mgs.setkulit(false);
        
        System.out.println("\n=============== MANGGIS ==============");
        System.out.println("Nama Buah            : " + mgs.getnama_buah());
        System.out.println("Warna                : " + mgs.getwarna());
        System.out.println("Rasa                 : " + mgs.getrasa());
        System.out.println("Berat Buah           : " + mgs.getberat() + " Kg");
        System.out.println("Harga per/kg         : Rp." + mgs.getharga());
        System.out.println("Kulit Bisa Dimakan   : " + (mgs.kulit? "Ya" : "Tidak"));
        
        AZKA_APEL apl = new AZKA_APEL();
        
        apl.setnama_buah("Apel");
        apl.setwarna("Merah");
        apl.setrasa("Manis");
        apl.setharga(7000);
        apl.setberat(4.5);
        apl.setkulit(true);
        
        System.out.println("\n=============== APEL =================");
        System.out.println("Nama Buah            : " + apl.getnama_buah());
        System.out.println("Warna                : " + apl.getwarna());
        System.out.println("Rasa                 : " + apl.getrasa());
        System.out.println("Berat Buah           : " + apl.getberat() + " Kg");
        System.out.println("Harga per/kg         : Rp." + apl.getharga());
        System.out.println("Kulit Bisa Dimakan   : " + (apl.kulit? "Ya" : "Tidak"));
    }
    
}
