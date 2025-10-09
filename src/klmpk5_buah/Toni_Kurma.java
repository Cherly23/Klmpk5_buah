package klmpk5_buah;
public class Toni_Kurma extends BuahClass {
    String nama_Buah;
    
    public void setNamaBuah(String namaBuah) {
        this.nama_Buah = namaBuah;
    }
    
    public String getNamaBuah() {
        return this.nama_Buah;
    }
    
     
     public  void TampilBuah () {
       System.out.println("Nama Buah          : " + this.nama_Buah);
       System.out.println("Warna Buah         : " + super.rasa);
       System.out.println("Rasa Buah          : " + super.warna);
       System.out.println("Harga Buah         : " + super.harga);
       System.out.println("Berat Buah         : " + super.berat);
       System.out.println("Kulik Bisa DImakan : " + super.kulit);
   }
     
}

