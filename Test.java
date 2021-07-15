
package prolab_proje_2;


import java.util.ArrayList;
import javax.swing.JFrame;

public class Test {
  public static Oyunekranı oyunekrani; 
    int ikilik;
    int üçlük;
    int serbestAtış;
    String isim;
    String basketbolcuAdi;
    String basketbolcuTakim;
    int penaltı;
    int serbestVuruş;
    int kaleciyleKarşıKarşıya;
    String futbolcuAdi;
    String futbolcuTakim;
    int özellik1;
    int özellik2;
    int özellik3;
    String image= "";
    public static boolean kullanildiMi;
    public static int sayacBasketbolcu = 0;
    public static int sayacFutbolcu = 0;
    
    public static int [] pozisyonOyuncuBasketbolcu = new int [3];
    public static int [] pozisyonBilgisayarBasketbolcu = new int [3];
    public static int [] pozisyonOyuncuFutbolcu = new int [3];
    public static int [] pozisyonBilgisayarFutbolcu = new int [3];
    
    static ArrayList<Test> bilgisayarKartlar = new ArrayList<Test>();
    static ArrayList<Test> kullaniciKartlar = new ArrayList<Test>();
    
    static ArrayList<Test> basketbolcuListesi = new ArrayList<Test>();
    static ArrayList<Test> oyuncuBasketbolcu = new ArrayList<Test>();
    static ArrayList<Test> bilgisayarBasketbolcu = new ArrayList<Test>();
    
    static ArrayList<Test> futbolcuListesi = new ArrayList<Test>();
    static ArrayList<Test> oyuncuFutbolcu = new ArrayList<Test>();
    static ArrayList<Test> bilgisayarFutbolcu = new ArrayList<Test>();
    
    public static int random;
    public static int random2;
    public static int rand; //rastgele seçilen futbolcu özellikleri
    public static int rnd; //rastgele seçilen basketbolcu özellikleri
    public static int bilgisayarSkor = 0;
    public static int kullaniciSkor = 0;
    
    public static boolean isKullanildiMi() {
        return kullanildiMi;
    }

    public static void setKullanildiMi(boolean kullanildiMi) {
        Test.kullanildiMi = kullanildiMi;
    }
    
    public static void main(String[] args) {
    
        
    
        Test basketbolcu1 = new Test(1, 2, 3, "Kobe","kobebryant.jpg");
        Test basketbolcu2 = new Test(4, 5, 6, "Lebron","lebronjames.jpg");
        Test basketbolcu3 = new Test(7, 8, 9, "Michael","michealjordan.jpg");
        Test basketbolcu4 = new Test(10, 11, 12, "Wilt","wiltchamberlain.jpg");
        Test basketbolcu5 = new Test(13, 14, 15, "Larry","larrybird.jpg");     
        Test basketbolcu6 = new Test(16, 17, 18, "Tim","timduncan.jpg");      
        Test basketbolcu7 = new Test(19, 20, 21, "Bill","billrussell.jpg");       
        Test basketbolcu8 = new Test(22, 23, 24, "Cedi","cediosman.jpg");
        

        basketbolcuListesi.add(basketbolcu1);
        basketbolcuListesi.add(basketbolcu2);
        basketbolcuListesi.add(basketbolcu3);
        basketbolcuListesi.add(basketbolcu4);
        basketbolcuListesi.add(basketbolcu5);
        basketbolcuListesi.add(basketbolcu6);
        basketbolcuListesi.add(basketbolcu7);
        basketbolcuListesi.add(basketbolcu8);
        
        for (int i = 0; i < 4; i++) {
            int random = (int)((Math.random() * 10) % basketbolcuListesi.size());
            kullaniciKartlar.add(basketbolcuListesi.get(random));
            basketbolcuListesi.remove(random);
            
            random = (int)((Math.random() * 10) % basketbolcuListesi.size());
            bilgisayarKartlar.add(basketbolcuListesi.get(random));
            basketbolcuListesi.remove(random);
        } 
 
        Test futbolcu1 = new Test(90, 90, 70, "Lionel","lionelmessi.jpg");
        Test futbolcu2 = new Test(70, 75, 85, "Cristiano","cristianoronaldo.jpg");
        Test futbolcu3 = new Test(60, 95, 75, "Diego","diegoarmandomaradona.jpg");
        Test futbolcu4 = new Test(45, 80, 65, "Pele","pele.jpg");
        Test futbolcu5 = new Test(50, 35, 90, "Ronaldinho","ronaldinho.jpg");     
        Test futbolcu6 = new Test(40, 65, 55, "Radamel","radamelfalcao.jpg");      
        Test futbolcu7 = new Test(25, 70, 80, "Andres","andresiniesta.jpg");       
        Test futbolcu8 = new Test(55, 55, 30, "Wesley","wesleysneijder.jpg");

        futbolcuListesi.add(futbolcu1);
        futbolcuListesi.add(futbolcu2);
        futbolcuListesi.add(futbolcu3);
        futbolcuListesi.add(futbolcu4);
        futbolcuListesi.add(futbolcu5);
        futbolcuListesi.add(futbolcu6);
        futbolcuListesi.add(futbolcu7);
        futbolcuListesi.add(futbolcu8);
        
       
        for (int i = 0; i < 4; i++) {
            int random2 = (int)((Math.random() * 10) % futbolcuListesi.size());
            kullaniciKartlar.add(futbolcuListesi.get(random2));
            futbolcuListesi.remove(random2);
            
            random2 = (int)((Math.random() * 10) % futbolcuListesi.size());
            bilgisayarKartlar.add(futbolcuListesi.get(random2));
            futbolcuListesi.remove(random2);
        }
        System.out.println("Kullanıcı kartlar:");
        for (int i = 0; i < 8; i++) {
            
            System.out.println(kullaniciKartlar.get(i).isim);
        }
        System.out.println();
        System.out.println("Bilgisayar kartlar:");
        for (int i = 0; i < 8; i++) {
            
            System.out.println(bilgisayarKartlar.get(i).isim);    
        }
        System.out.println();

    
    Oyunekranı oyunekrani = new Oyunekranı();
    oyunekrani.setTitle("Kart Oyunu");
    oyunekrani.setLayout(null);
    oyunekrani.setResizable(false);
    oyunekrani.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    oyunekrani.setVisible(true);
    
    }




    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getÖzellik1() {
        return özellik1;
    }

    public void setÖzellik1(int özellik1) {
        this.özellik1 = özellik1;
    }

    public int getÖzellik2() {
        return özellik2;
    }

    public void setÖzellik2(int özellik2) {
        this.özellik2 = özellik2;
    }

    public int getÖzellik3() {
        return özellik3;
    }

    public void setÖzellik3(int özellik3) {
        this.özellik3 = özellik3;
    }

    public String getIcon() {
        return image;
    }
    
    public void setIcon(String image) {
        this.image = image;
    }
    
    private Test(int özellik1, int özellik2, int özellik3, String isim, String image) {
        this.özellik1 = özellik1;
        this.özellik2 = özellik2;
        this.özellik3 = özellik3;
        this.isim = isim;
        this.image = image;
    }
    
    public int pozisyon(Sporcu sporcuIsim){
        return ((int)((Math.random()) * 10)%3);
    }

   

    

    

   

    
    
    

}
