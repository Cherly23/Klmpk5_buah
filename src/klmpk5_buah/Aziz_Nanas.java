package klmpk5_buah;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Aziz_Nanas {
    
   public class Buah {
    // Atribut (properties)
    String Nama_buah,Warna,Rasa;
    double Harga,Berat;
    boolean kulit;

    // Setter
    public void setNama_buah(String Nama_buah) {
        this.Nama_buah = Nama_buah;
    }

    public void setWarna(String warna) {
        this.Warna = warna;
    }

    public void setBerat(double berat) {
        this.Berat = berat;
    }

    public void setHarga(double Harga) {
        this.Harga = Harga;
    }
    
    public void setRasa(String Rasa) {
        this.Rasa = Rasa;}
    
    public void setHarga(boolean Kulit) {
        this.kulit = Kulit;
    }

    // Getter
    public String getNama_buah() {
        return Nama_buah;
    }

    public String getWarna() {
        return Warna;
    }
    
     public String getRasa() {
        return Rasa;
    }

    public double getBerat() {
        return Berat;
    }

    public double getHarga() {
        return Harga;
    }
    
    public boolean getKulit() {
        return kulit;
    }

   
    }
}