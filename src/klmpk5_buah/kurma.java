package klmpk5_buah;

/**
 *
 * @author ASUS
 */
public class kurma {
    public static void main(String[] args) {
        Toni_Kurma kurma =new Toni_Kurma();
        kurma.nama_Buah = "Kurma";
        kurma.warna = "Coklat tua";
        kurma.rasa = "Manis Legit";
        kurma.harga = 50000;
        kurma.berat = 1000;
        kurma.kulit = true; 
        
        System.out.println("Nama_Buah :" + kurma.nama_Buah);
        System.out.println("Warna Buah" + kurma.warna);
        System.out.println("Rasa :" + kurma.rasa);
        System.out.println("Harga Buah Perkilo :" + kurma.harga + "hgram");
        System.out.println("Kulit Bisa Dimakan :" +(kurma.kulit ? "ya" : "Tidak"));
    }
    
}
