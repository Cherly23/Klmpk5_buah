package klmpk5_buah;

public class AZKA_APEL {
    private String nama_buah, rasa, warna;
    boolean kulit;
    double harga, berat;
    
  
    public void setnama_buah(String nb){
        this.nama_buah = nb;
    }
    public String getnama_buah(){
        return this.nama_buah;
    }
    public void setrasa(String sr){
        this.rasa = sr; 
    }
    public String getrasa(){
        return this.rasa;
    }
    public String getwarna(){
        return this.warna;    
    }
    public void setwarna(String wr){
        this.warna = wr;
    }
    public void setkulit(boolean kl){
        this.kulit = kl;
    }
    public boolean getkulit(){
        return this.kulit;
    }
    public void setharga(double hrg){
        this.harga = hrg;
    }
    public double getharga(){
        return this.harga;
    }
    public void setberat(double brt){
        this.berat = brt;
    }
    public double getberat() {
        return this.berat;
    }
    
    String nama_buah, rasa, warna;
    boolean kulit;
    double harga, berat;

    public String getNama_buah() {
        return nama_buah;
    }
    public void setNama_buah(String nama_buah) {
        this.nama_buah = nama_buah;
    }
    public String getRasa() {
        return rasa;
    }
    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public boolean isKulit() {
        return kulit;
    }
    public void setKulit(boolean kulit) {
        this.kulit = kulit;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double getBerat() {
        return berat;
    }
    public void setBerat(double berat) {
        this.berat = berat;
    }
     
}
