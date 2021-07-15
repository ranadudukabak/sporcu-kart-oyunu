package prolab_proje_2;

import static prolab_proje_2.Test.kullaniciKartlar;

public class Kullanıcı extends Oyuncu {
    
    public Kullanıcı(int oyuncuID, String oyuncuAdi, int oyuncuSkor) {
        super(oyuncuID, oyuncuAdi, oyuncuSkor);
    }
    
    static int randomtut;
    static int randtut;

    public static int randomyakala(){
        return randomtut;
    }
    
    public static int randyakala(){
        return randtut;
    }
}
