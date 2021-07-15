package prolab_proje_2;

//import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Basketbolcu extends Sporcu{
    int ikilik;
    int üçlük;
    int serbestAtış;
    String isim;
    String basketbolcuAdi;
    String basketbolcuTakim;
    String image= "";

    public Basketbolcu(String basketbolcuAdi, String basketbolcuTakim) {
        super(basketbolcuAdi, basketbolcuTakim);
    }

    public Basketbolcu(int ikilik, int üçlük, int serbestAtış, String isim, String image) {
        this.ikilik = ikilik;
        this.üçlük = üçlük;
        this.serbestAtış = serbestAtış;
        this.isim = isim;
       
    }

    public String getIcon() {
        return image;
    }

    public void setIcon(String image) {
        this.image = image;
    }
    
    public String getBasketbolcuAdi() {
        return basketbolcuAdi;
    }

    public void setBasketbolcuAdi(String basketbolcuAdi) {
        this.basketbolcuAdi = basketbolcuAdi;
    }

    public String getBasketbolcuTakim() {
        return basketbolcuTakim;
    }

    public void setBasketbolcuTakim(String basketbolcuTakim) {
        this.basketbolcuTakim = basketbolcuTakim;
    }
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getÜçlük() {
        return üçlük;
    }

    public void setÜçlük(int üçlük) {
        this.üçlük = üçlük;
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getSerbestAtış() {
        return serbestAtış;
    }

    public void setSerbestAtış(int serbestAtış) {
        this.serbestAtış = serbestAtış;
    }
}
