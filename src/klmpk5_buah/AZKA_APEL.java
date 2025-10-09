package klmpk5_buah;

public class AZKA_APEL extends BuahClass {
    String nama_buah ;
    
    public void setnama_buah(String na) {
        this.nama_buah = na ;
    }
    public String getnama_buah(){
        return this.nama_buah; 
    }
    public void TampilBuah (){
        System.out.println("Nama Buah          : " + this.nama_buah);
        System.out.println("Rasa Buah          : " + super.rasa );
        System.out.println("Warna Buah         : " + super.warna);
        System.out.println("Harga Buah         : " + super.harga);
        System.out.println("Berat Buah         : " + super.berat);
        System.out.println("Kulit Bisa Dimakan : " + super.kulit);
    }  
   
   
    
   
}
