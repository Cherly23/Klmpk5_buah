package klmpk5_buah;
public class Toni_Kurma {
    String nama_Buah, warna, rasa;
    double harga, berat;
    boolean kulit;
    public void setNamaBuah(String namaBuah) {
        this.nama_Buah = namaBuah;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setKulit(boolean klt) {
        this.kulit = klt;
    }
    public void setBerat(double berat) {
        this.berat = berat;
    }
    public String getNamaBuah() {
        return this.nama_Buah;
    }
    public String getWarna() {
        return this.warna;
    }
    public String getRasa() {
        return this.rasa;
    }
    public double getHarga() {
        return this.harga;
    }
    public double getBerat() {
        return this.berat;
    }
     public boolean getKulit() {
        return this.kulit;
    }
}

