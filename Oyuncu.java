
package prolab_proje_2;


public abstract class Oyuncu {
    int oyuncuID;
    String oyuncuAdi;
    int oyuncuSkor;

    public Oyuncu(int oyuncuID, String oyuncuAdi, int oyuncuSkor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.oyuncuSkor = oyuncuSkor;
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getOyuncuSkor() {
        return oyuncuSkor;
    }

    public void setOyuncuSkor(int oyuncuSkor) {
        this.oyuncuSkor = oyuncuSkor;
    }
 
        
}
    
   
    

