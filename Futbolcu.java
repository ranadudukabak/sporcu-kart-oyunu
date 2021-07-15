
package prolab_proje_2;


public class Futbolcu extends Sporcu{
    int penaltı;
    int serbestVuruş;
    int kaleciyleKarşıKarşıya;
    String isim;
    String futbolcuAdi;
    String futbolcuTakim;
    
    public Futbolcu(String futbolcuAdi, String futbolcuTakim) {
        super(futbolcuAdi, futbolcuTakim);
    }
    
    public Futbolcu(int penaltı, int serbestVuruş, int kaleciyleKarşıKarşıya, String isim) {    
        this.penaltı = penaltı;
        this.serbestVuruş = serbestVuruş;
        this.kaleciyleKarşıKarşıya = kaleciyleKarşıKarşıya;
        this.isim = isim;
    }
    
    public String getFutbolcuAdi() {
        return futbolcuAdi;
    }

    public void setFutbolcuAdi(String futbolcuAdi) {
        this.futbolcuAdi = futbolcuAdi;
    }

    public String getFutbolcuTakim() {
        return futbolcuTakim;
    }

    public void setFutbolcuTakim(String futbolcuTakim) {
        this.futbolcuTakim = futbolcuTakim;
    }
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getPenaltı() {
        return penaltı;
    }

    public void setPenaltı(int penaltı) {
        this.penaltı = penaltı;
    }

    public int getSerbestVuruş() {
        return serbestVuruş;
    }

    public void setSerbestVuruş(int serbestVuruş) {
        this.serbestVuruş = serbestVuruş;
    }

    public int getKaleciyleKarşıKarşıya() {
        return kaleciyleKarşıKarşıya;
    }

    public void setKaleciyleKarşıKarşıya(int kaleciyleKarşıKarşıya) {
        this.kaleciyleKarşıKarşıya = kaleciyleKarşıKarşıya;
    }
    
    public void sporcuPuaniGoster() {
 
    }
    
//    public boolean kartKullanildiMi() {
//        
//    }
    
}
