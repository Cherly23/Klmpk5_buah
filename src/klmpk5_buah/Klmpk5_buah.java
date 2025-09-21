/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klmpk5_buah;

public class Klmpk5_buah {
    public static void main(String[] args) {
        
        cherlyMangga buah = new cherlyMangga();
        
        buah.setnama_buah("Mangga");
        buah.setwarna("Hijau");
        buah.setrasa("Manis");
        buah.setharga(55000);
        buah.setberat(250);
        buah.setkulit(false);
        
        System.out.println("=============== MANGGA ===============");
        System.out.println("Nama Buah            : " + buah.getnama_buah());
        System.out.println("Warna                : " + buah.getwarna());
        System.out.println("Rasa                 : " + buah.getrasa());
        System.out.println("Berat Buah           : " + buah.getberat() + " gram");
        System.out.println("Harga per/kg         : Rp." + buah.getharga());
        System.out.println("Kulit Bisa Dimakan   : " + (buah.getkulit()? "Ya" : "Tidak"));
        
        Aziz_Nanas nns = new Aziz_Nanas();
        
        nns.setNama_buah("Nanas");
        nns.setWarna("Hijau Kekuningan");
        nns.setRasa("Manis");
        nns.setHarga(15000);
        nns.setBerat(900);
        nns.setKulit(false);
        
        System.out.println("\n=============== NANAS ================");
        System.out.println("Nama Buah            : " + nns.getNama_buah());
        System.out.println("Warna                : " + nns.getWarna());
        System.out.println("Rasa                 : " + nns.getRasa());
        System.out.println("Berat Buah           : " + nns.getBerat() + " gram");
        System.out.println("Harga per/kg         : Rp." + nns.getHarga());
        System.out.println("Kulit Bisa Dimakan   : " + (nns.getKulit()? "Ya" : "Tidak"));
        
        Toni_Kurma krm = new Toni_Kurma();
        
        krm.setNamaBuah("Kurma");
        krm.setWarna("Coklat Tua");
        krm.setRasa("Manis");
        krm.setHarga(30000);
        krm.setBerat(8);
        krm.setKulit(true);
        
        System.out.println("\n=============== KURMA ================");
        System.out.println("Nama Buah            : " + krm.getNamaBuah());
        System.out.println("Warna                : " + krm.getWarna());
        System.out.println("Rasa                 : " + krm.getRasa());
        System.out.println("Berat Buah           : " + krm.getBerat() + " gram");
        System.out.println("Harga per/kg         : Rp." + krm.getHarga());
        System.out.println("Kulit Bisa Dimakan   : " + (krm.getKulit()? "Ya" : "Tidak"));
        
        Cialin_Jeruk jrk = new Cialin_Jeruk();
        
        jrk.setnama_buah("Jeruk");
        jrk.setwarna("Kuning");
        jrk.setrasa("Manis");
        jrk.setharga(20000);
        jrk.setberat(130);
        jrk.setkulit(false);
        
        System.out.println("\n=============== JERUK ================");
        System.out.println("Nama Buah            : " + jrk.getnama_buah());
        System.out.println("Warna                : " + jrk.getwarna());
        System.out.println("Rasa                 : " + jrk.getrasa());
        System.out.println("Berat Buah           : " + jrk.getberat() + " gram");
        System.out.println("Harga per/kg         : Rp." + jrk.getharga());
        System.out.println("Kulit Bisa Dimakan   : " + (jrk.getkulit()? "Ya" : "Tidak"));
        
        Ichul_Manggis Manggis = new Ichul_Manggis();
        
        Manggis.nama_buah = "Manggis";
        Manggis.warna = "Ungu tua";
        Manggis.rasa = "Manis dan tidak terlalu asam";
        Manggis.harga = 30000;
        Manggis.berat = 80;
        Manggis.kulit = false ;
                
        System.out.println("\n============== MANGGIS ==============");
        System.out.println("Nama Buah           : " + Manggis.nama_buah);
        System.out.println("Warna Buah          : " + Manggis.warna);
        System.out.println("Rasa                : " + Manggis.rasa);
        System.out.println("Berat perbuah       : " + Manggis.berat + " gram");
        System.out.println("Harga Buah perkilo  : Rp." + Manggis.harga );
        System.out.println("Kulit bisa dimakan  : " + (Manggis.getkulit()? "Ya" : "Tidak"));
        
        AZKA_APEL apl = new AZKA_APEL();
        
        apl.setnama_buah("Apel");
        apl.setwarna("Merah");
        apl.setrasa("Manis");
        apl.setharga(30000);
        apl.setberat(160);
        apl.setkulit(true);
        
        System.out.println("\n=============== APEL =================");
        System.out.println("Nama Buah            : " + apl.getnama_buah());
        System.out.println("Warna                : " + apl.getwarna());
        System.out.println("Rasa                 : " + apl.getrasa());
        System.out.println("Berat Buah           : " + apl.getberat() + " gram");
        System.out.println("Harga per/kg         : Rp." + apl.getharga());
        System.out.println("Kulit Bisa Dimakan   : " + (apl.getkulit()? "Ya" : "Tidak"));
    }
    
}
