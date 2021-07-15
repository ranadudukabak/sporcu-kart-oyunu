package prolab_proje_2;

import java.util.ArrayList;
import static prolab_proje_2.Test.basketbolcuListesi;
import static prolab_proje_2.Test.futbolcuListesi;

public class Bilgisayar extends Oyuncu{
    
    public static ArrayList<Test> basketbolcuListesi = new ArrayList<>();
    public static ArrayList<Test> futbolcuListesi = new ArrayList<>();

//    static Test basketbolcuAl= new Test();
//    static Test futbolcuAl= new Test();
    static int randomtut;
    static int randtut;
    public static int sayacBasketbolcu = 0;
    public static int sayacFutbolcu = 0;

    public Bilgisayar(int oyuncuID, String oyuncuAdi, int oyuncuSkor) {
        super(oyuncuID, oyuncuAdi, oyuncuSkor);
    }
    
    public int randomyakala(){
        return randomtut;
    }
    public int randyakala(){
        return randtut;
    }
}
