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
        this.rasa = wr;
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
    
}
