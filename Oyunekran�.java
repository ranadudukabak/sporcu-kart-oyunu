
package prolab_proje_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static prolab_proje_2.Test.bilgisayarKartlar;
import static prolab_proje_2.Test.bilgisayarSkor;
import static prolab_proje_2.Test.kullaniciKartlar;
import static prolab_proje_2.Test.kullaniciSkor;
import static prolab_proje_2.Test.pozisyonBilgisayarBasketbolcu;
import static prolab_proje_2.Test.pozisyonBilgisayarFutbolcu;
import static prolab_proje_2.Test.pozisyonOyuncuBasketbolcu;
import static prolab_proje_2.Test.pozisyonOyuncuFutbolcu;


public class Oyunekranı extends javax.swing.JFrame implements ActionListener, MouseListener {

   
    public String alinanisim;
    public int tut=-1;
    public int tursayisi=1;
    public int ks=0;
    public int bs=0;
    public int e=0;
    public int q=4;
    public int rnd;
    public int rand;
    public static String dosya = "/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/";
   
    public Oyunekranı() {
        initComponents();
        bKart1.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/kartarkası.jpg"));
        bKart2.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/kartarkası.jpg"));
        bKart3.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/kartarkası.jpg"));
        bKart4.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/kartarkası.jpg"));
        bKart5.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/kartarkası.jpg"));
        bKart6.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/kartarkası.jpg"));
        bKart7.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/kartarkası.jpg"));
        bKart8.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/kartarkası.jpg"));
        bSkor.setText("0");
        kSkor.setText("0");

        kKart1.setText(kullaniciKartlar.get(0).isim);
        kKart2.setText(kullaniciKartlar.get(1).isim);
        kKart3.setText(kullaniciKartlar.get(2).isim);
        kKart4.setText(kullaniciKartlar.get(3).isim);
        kKart5.setText(kullaniciKartlar.get(4).isim);
        kKart6.setText(kullaniciKartlar.get(5).isim);
        kKart7.setText(kullaniciKartlar.get(6).isim);
        kKart8.setText(kullaniciKartlar.get(7).isim);
        
        kKart1.addActionListener(this);
        kKart2.addActionListener(this);
        kKart3.addActionListener(this);
        kKart4.addActionListener(this);
        kKart5.addActionListener(this);
        kKart6.addActionListener(this);
        kKart7.addActionListener(this);
        kKart8.addActionListener(this);
       
 
    
    }
    @Override
      public void actionPerformed(ActionEvent e) { //İŞLEM SIRASI


if (tursayisi % 2 != 0) {
            if(e.getSource()==kKart1){
       kOrta.setBackground(java.awt.Color.white);     
       kOrta.setText(kKart1.getText()); 
       pozisyonYaz(0);
       kKart1.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
//       kÖzellik.setText(String.valueOf(kullaniciKartlar.get(0).özellik1));
        }
    if(e.getSource()==kKart2){
       kOrta.setBackground(java.awt.Color.white);      
       kOrta.setText(kKart2.getText());
       pozisyonYaz(1);
       kKart2.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
//       kÖzellik.setText(String.valueOf(kullaniciKartlar.get(1).özellik1));
        }
    if(e.getSource()==kKart3){
       kOrta.setBackground(java.awt.Color.white);     
       kOrta.setText(kKart3.getText());
       pozisyonYaz(2);
       kKart3.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
        }
    if(e.getSource()==kKart4){
       kOrta.setBackground(java.awt.Color.white);      
       kOrta.setText(kKart4.getText());
       pozisyonYaz(3);
       kKart4.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
        }
    if(e.getSource()==kKart5){
       kOrta.setBackground(java.awt.Color.white);      
       kOrta.setText(kKart5.getText());
       pozisyonYaz(4);
       kKart5.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
        }
    if(e.getSource()==kKart6){
       kOrta.setBackground(java.awt.Color.white);      
       kOrta.setText(kKart6.getText());
       pozisyonYaz(5);
       kKart6.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
        }
    if(e.getSource()==kKart7){
       kOrta.setBackground(java.awt.Color.white);      
       kOrta.setText(kKart7.getText());
       pozisyonYaz(6);
       kKart7.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
        }
    if(e.getSource()==kKart8){
       kOrta.setBackground(java.awt.Color.white);      
       kOrta.setText(kKart8.getText());
       pozisyonYaz(7);
       kKart8.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
        }

    
            tursayisi++;
        }


if (tursayisi % 2 == 0 && (kOrta.getText().equals("Kobe")|| kOrta.getText().equals("Lebron")|| kOrta.getText().equals("Micheal")|| kOrta.getText().equals("Wilt")|| kOrta.getText().equals("Larry")|| kOrta.getText().equals("Tim")||kOrta.getText().equals("Bill")||kOrta.getText().equals("Cedi") )) {

 
               kÖzellikSec(); 
               bKartSec();
               bÖzellikSec();
               basketbolculariKarsilastir();

            ortayitemizle();
            tut = -1;
            tursayisi++;
        }
if (tursayisi % 2 ==0 && (kOrta.getText().equals("Lionel")|| kOrta.getText().equals("Cristiano")|| kOrta.getText().equals("Diego")|| kOrta.getText().equals("Pele")|| kOrta.getText().equals("Ronaldinho")|| kOrta.getText().equals("Radamel")|| kOrta.getText().equals("Andres")||kOrta.getText().equals("Wesley"))){
   
            kÖzellikSec();
            bKartSec();
            bÖzellikSec();
            futbolculariKarsilastir();
    
            ortayitemizle();
            tut = -1;
            tursayisi++;
   
}


        if (tursayisi > 8) {
           kazananbelirle();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
//            time.stop();
            setVisible(false);
            System.exit(0);
        }
    }

  
public int kullaniciSkorGoster(int pozisyonOyuncuBasketbolcu, int pozisyonBilgisayarBasketbolcu) {
            if(pozisyonOyuncuBasketbolcu > pozisyonBilgisayarBasketbolcu)
                kullaniciSkor += 10;
            
            return kullaniciSkor;  
    }
    
    public int bilgisayarSkorGoster(int pozisyonOyuncuBasketbolcu, int pozisyonBilgisayarBasketbolcu) {
            if(pozisyonOyuncuBasketbolcu < pozisyonBilgisayarBasketbolcu)
                bilgisayarSkor += 10;
            
            return bilgisayarSkor;
    }

    public int kullaniciSkor2Goster(int pozisyonOyuncuFutbolcu, int pozisyonBilgisayarFutbolcu) {
        if(pozisyonOyuncuFutbolcu > pozisyonBilgisayarFutbolcu)
                kullaniciSkor += 10;
        
        return kullaniciSkor;
    }
        
    public int bilgisayarSkor2Goster(int pozisyonOyuncuFutbolcu, int pozisyonBilgisayarFutbolcu) {
        if(pozisyonOyuncuFutbolcu < pozisyonBilgisayarFutbolcu)
                bilgisayarSkor += 10;
            
        return bilgisayarSkor;
    }

 
    
    
    public void skorgoster() {
     
        int a= ks;
       String s = Integer.toString(a);
        kSkor.setText(s);
        int b=bs;
        String t = Integer.toString(b);
        bSkor.setText(t);
    }
    
    
    
    

    public void ortayitemizle() {
        bOrta.setBackground(java.awt.Color.black);
        kOrta.setBackground(java.awt.Color.black);
    }
    
    public void kazananbelirle() {
        if(bilgisayarSkor>kullaniciSkor){
            JOptionPane.showMessageDialog(null,"BİLGİSAYAR KAZANDI");
        }
        else if(bilgisayarSkor<kullaniciSkor){
            JOptionPane.showMessageDialog(null,"SİZ KAZANDINIZ");
        }
        else if(bilgisayarSkor==kullaniciSkor){
            JOptionPane.showMessageDialog(null,"BERABERE");
        }
    }
    
   


  
    public void bKartSec() {
     
        if(kOrta.getText().equals("Kobe")|| kOrta.getText().equals("Lebron")|| kOrta.getText().equals("Micheal")|| kOrta.getText().equals("Wilt")|| kOrta.getText().equals("Larry")|| kOrta.getText().equals("Tim")||kOrta.getText().equals("Bill")||kOrta.getText().equals("Cedi") ){
          
           while(e<4){
                 switch(e){
                     case 0:
                    bOrta.setText(bilgisayarKartlar.get(0).isim);
                    bKart1.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));    
                    e++;
                     case 1:
                    bOrta.setText(bilgisayarKartlar.get(1).isim);
                    bKart1.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
                    e++;
                     case 2:
                         bOrta.setText(bilgisayarKartlar.get(2).isim);
                    bKart1.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
                     e++;
                     case 3:
                    bOrta.setText(bilgisayarKartlar.get(3).isim);
                    bKart1.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
                    e++;
  
                 }
         }
           
      } 
        
         if(kOrta.getText().equals("Lionel")|| kOrta.getText().equals("Cristiano")|| kOrta.getText().equals("Diego")|| kOrta.getText().equals("Pele")|| kOrta.getText().equals("Ronaldinho")|| kOrta.getText().equals("Radamel")|| kOrta.getText().equals("Andres")||kOrta.getText().equals("Wesley") ){

             while(q<8){
                 switch(q){
                     case 4:
                    bOrta.setText(bilgisayarKartlar.get(0).isim);
                    bKart1.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));    
                     q++;
                     case 5:
                    bOrta.setText(bilgisayarKartlar.get(1).isim);
                    bKart1.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
                     q++;
                     case 6:
                         bOrta.setText(bilgisayarKartlar.get(2).isim);
                    bKart1.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
                     q++;
                     case 7:
                         bOrta.setText(bilgisayarKartlar.get(3).isim);
                    bKart1.setIcon(new ImageIcon("/Users/gulay/Documents/NetBeansProjects/prolab_proje_2/src/Images/null.jpg"));
                 q++;
  
                 }
         
                 
         }


         }
      
      
       
    }
    
    
    public void kÖzellikSec() {
           switch (özellik.getText()) {
            case "PENALTI":
                kÖzellik.setText(String.valueOf(kullaniciKartlar.get(rand).özellik1));
                break;
            case "SERBEST VURUŞ":
                kÖzellik.setText(String.valueOf(kullaniciKartlar.get(rand).özellik2));
                break;
            case "KALECİYLE KARŞI KARŞIYA":
                kÖzellik.setText(String.valueOf(kullaniciKartlar.get(rand).özellik3));
                break;
            case "İKİLİK":
                kÖzellik.setText(String.valueOf(kullaniciKartlar.get(rnd).özellik1));
                break;
            case "ÜÇLÜK":
                kÖzellik.setText(String.valueOf(kullaniciKartlar.get(rnd).özellik2));
                break;
            case "SERBEST ATIŞ":
                kÖzellik.setText(String.valueOf(kullaniciKartlar.get(rnd).özellik3));
                break;
    
        }
    }
           

    public void bÖzellikSec() {
           switch (özellik.getText()) {
            case "PENALTI":
                bÖzellik.setText(String.valueOf(bilgisayarKartlar.get(rand).özellik1));
                break;
            case "SERBEST VURUŞ":
                bÖzellik.setText(String.valueOf(bilgisayarKartlar.get(rand).özellik2));
                break;
            case "KALECİYLE KARŞI KARŞIYA":
                bÖzellik.setText(String.valueOf(bilgisayarKartlar.get(rand).özellik3));
                break;
            case "İKİLİK":
                bÖzellik.setText(String.valueOf(bilgisayarKartlar.get(rnd).özellik1));
                break;
            case "ÜÇLÜK":
                bÖzellik.setText(String.valueOf(bilgisayarKartlar.get(rnd).özellik2));
                break;
            case "SERBEST ATIŞ":
                bÖzellik.setText(String.valueOf(bilgisayarKartlar.get(rnd).özellik3));
                break;
    
        }
       
    }
    
    public void basketbolculariKarsilastir() {
        

            int rnd = (int) (Math.random() * 3);
            
            int j = (int) (Math.random() * 4)%(bilgisayarKartlar.size());
            

            
            switch (rnd) {
                case 0:
                    pozisyonOyuncuBasketbolcu[0] = kullaniciKartlar.get(j).özellik1;
                    System.out.println(kullaniciKartlar.get(j).özellik1);
                    
                    pozisyonBilgisayarBasketbolcu[0] = bilgisayarKartlar.get(j).özellik1;
                    System.out.println(bilgisayarKartlar.get(j).özellik1);                   
 
                    
                    ks+=kullaniciSkorGoster(pozisyonOyuncuBasketbolcu[0], pozisyonBilgisayarBasketbolcu[0]);
                    bs+=bilgisayarSkorGoster(pozisyonOyuncuBasketbolcu[0], pozisyonBilgisayarBasketbolcu[0]);
                    
                    kSkor.setText(String.valueOf(ks));
                    bSkor.setText(String.valueOf(bs));
                    
 //                   özellik.setText("İKİLİK");
                    bÖzellik.setText(String.valueOf(pozisyonBilgisayarBasketbolcu[0]));
                    kÖzellik.setText(String.valueOf(pozisyonOyuncuBasketbolcu[0]));
                    
                   
                   
                    
                    break;
                case 1:
                    pozisyonOyuncuBasketbolcu[1] = kullaniciKartlar.get(j).özellik2;
                    System.out.println(kullaniciKartlar.get(j).özellik2);
                    pozisyonBilgisayarBasketbolcu[1] = bilgisayarKartlar.get(j).özellik2;
                    System.out.println(bilgisayarKartlar.get(j).özellik2);
                    

                    
                    ks+=kullaniciSkorGoster(pozisyonOyuncuBasketbolcu[1], pozisyonBilgisayarBasketbolcu[1]);
                    bs+=bilgisayarSkorGoster(pozisyonOyuncuBasketbolcu[1], pozisyonBilgisayarBasketbolcu[1]);
                    
                    kSkor.setText(String.valueOf(ks));
                    bSkor.setText(String.valueOf(bs));
                    

                    bÖzellik.setText(String.valueOf(pozisyonBilgisayarBasketbolcu[1]));
                    kÖzellik.setText(String.valueOf(pozisyonOyuncuBasketbolcu[1]));
                    
                    
                    break;
                default:
                    pozisyonOyuncuBasketbolcu[2] = kullaniciKartlar.get(j).özellik3;
                    System.out.println(kullaniciKartlar.get(j).özellik3);
                    pozisyonBilgisayarBasketbolcu[2] = bilgisayarKartlar.get(j).özellik3;
                    System.out.println(bilgisayarKartlar.get(j).özellik3);
                    

                    
                    ks+=kullaniciSkorGoster(pozisyonOyuncuBasketbolcu[2], pozisyonBilgisayarBasketbolcu[2]);
                    bs+=bilgisayarSkorGoster(pozisyonOyuncuBasketbolcu[2], pozisyonBilgisayarBasketbolcu[2]);
                    
                    kSkor.setText(String.valueOf(ks));
                    bSkor.setText(String.valueOf(bs));
                    

                    bÖzellik.setText(String.valueOf(pozisyonBilgisayarBasketbolcu[2]));
                    kÖzellik.setText(String.valueOf(pozisyonOyuncuBasketbolcu[2]));
                    
                    break;
            }

            
 
    }
    public void futbolculariKarsilastir() {

   
            int rand = (int) (Math.random() * 3);

            int j = (int) (Math.random() * 4)% bilgisayarKartlar.size();
            
            switch (rand) {
                case 0:
                    pozisyonOyuncuFutbolcu[0] = kullaniciKartlar.get(j).özellik1;
                    System.out.println(kullaniciKartlar.get(j).özellik1);
                    
                    pozisyonBilgisayarFutbolcu[0] = bilgisayarKartlar.get(j).özellik1;
                    System.out.println(bilgisayarKartlar.get(j).özellik1);

                    ks+=kullaniciSkorGoster(pozisyonOyuncuFutbolcu[0], pozisyonBilgisayarFutbolcu[0]);
                    bs+=bilgisayarSkorGoster(pozisyonOyuncuFutbolcu[0], pozisyonBilgisayarFutbolcu[0]);
                    
                    kSkor.setText(String.valueOf(ks));
                    bSkor.setText(String.valueOf(bs));
                    

                    bÖzellik.setText(String.valueOf(bilgisayarKartlar.get(j).özellik1));
                    kÖzellik.setText(String.valueOf(kullaniciKartlar.get(j).özellik1));
                   
                    
                   
                    
                    break;
                case 1:
                    pozisyonOyuncuFutbolcu[1] = kullaniciKartlar.get(j).özellik2;
                    System.out.println(kullaniciKartlar.get(j).özellik2);
                    pozisyonBilgisayarFutbolcu[1] = bilgisayarKartlar.get(j).özellik2;
                    System.out.println(bilgisayarKartlar.get(j).özellik2);
    
                    ks+=kullaniciSkorGoster(pozisyonOyuncuFutbolcu[1], pozisyonBilgisayarFutbolcu[1]);
                    bs+=bilgisayarSkorGoster(pozisyonOyuncuFutbolcu[1], pozisyonBilgisayarFutbolcu[1]);
                    
                    kSkor.setText(String.valueOf(ks));
                    bSkor.setText(String.valueOf(bs));
                   

                    bÖzellik.setText(String.valueOf(bilgisayarKartlar.get(j).özellik2));
                    kÖzellik.setText(String.valueOf(kullaniciKartlar.get(j).özellik2));
                    
                 
                    break;
                default:
                    pozisyonOyuncuFutbolcu[2] = kullaniciKartlar.get(j).özellik3;
                    System.out.println(kullaniciKartlar.get(j).özellik3);
                    pozisyonBilgisayarFutbolcu[2] = bilgisayarKartlar.get(j).özellik3;
                    System.out.println(bilgisayarKartlar.get(j).özellik3);
            

                    ks+=kullaniciSkorGoster(pozisyonOyuncuFutbolcu[2], pozisyonBilgisayarFutbolcu[2]);
                    bs+=bilgisayarSkorGoster(pozisyonOyuncuFutbolcu[2], pozisyonBilgisayarFutbolcu[2]);
                    
                    kSkor.setText(String.valueOf(ks));
                    bSkor.setText(String.valueOf(bs));
                   

                    bÖzellik.setText(String.valueOf(bilgisayarKartlar.get(j).özellik3));
                    kÖzellik.setText(String.valueOf(kullaniciKartlar.get(j).özellik3));
                    
                    break;
            }

    }
     
    public void pozisyonYaz(int i){

   if(i<4){
        switch (rnd) {
            case 0:
                özellik.setText("İKİLİK");
                break;
            case 1:
                özellik.setText("ÜÇLÜK");
                break;
   
            default:
                 özellik.setText("SERBEST ATIŞ");
                break;
                
        }
 
   }
   else if(i>=4){
        switch (rand) {
            case 0:
                özellik.setText("PENALTI");
                break;
            case 1:
                özellik.setText("SERBEST VURUŞ");
                break;
     
            default:
               özellik.setText("KALECİYLE KARŞI KARŞIYA");
                break;
        }
   }

    
 }



    
     @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kKartButonlari = new javax.swing.ButtonGroup();
        bKart1 = new javax.swing.JButton();
        bKart2 = new javax.swing.JButton();
        bKart3 = new javax.swing.JButton();
        bKart4 = new javax.swing.JButton();
        bKart5 = new javax.swing.JButton();
        bKart6 = new javax.swing.JButton();
        bKart7 = new javax.swing.JButton();
        bKart8 = new javax.swing.JButton();
        bOrta = new javax.swing.JButton();
        kOrta = new javax.swing.JButton();
        kKart1 = new javax.swing.JButton();
        kKart2 = new javax.swing.JButton();
        kKart3 = new javax.swing.JButton();
        kKart4 = new javax.swing.JButton();
        kKart5 = new javax.swing.JButton();
        kKart6 = new javax.swing.JButton();
        kKart7 = new javax.swing.JButton();
        kKart8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        özellik = new javax.swing.JTextField();
        bÖzellik = new javax.swing.JTextField();
        kÖzellik = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        bSkor = new javax.swing.JTextField();
        k = new javax.swing.JTextField();
        kSkor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bKart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKart1ActionPerformed(evt);
            }
        });
        getContentPane().add(bKart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 20, 100, 150));

        bKart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKart2ActionPerformed(evt);
            }
        });
        getContentPane().add(bKart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 20, 100, 150));
        getContentPane().add(bKart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 20, 100, 150));
        getContentPane().add(bKart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 20, 100, 150));
        getContentPane().add(bKart5, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 20, 100, 150));
        getContentPane().add(bKart6, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 20, 100, 150));
        getContentPane().add(bKart7, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 20, 100, 150));
        getContentPane().add(bKart8, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 20, 100, 150));

        bOrta.setBackground(new java.awt.Color(0, 0, 0));
        bOrta.setForeground(new java.awt.Color(255, 255, 255));
        bOrta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrtaActionPerformed(evt);
            }
        });
        getContentPane().add(bOrta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 336, 100, 150));

        kOrta.setBackground(new java.awt.Color(0, 0, 0));
        kOrta.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(kOrta, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 336, 100, 150));

        kKart1.setBackground(new java.awt.Color(255, 255, 255));
        kKart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kKart1ActionPerformed(evt);
            }
        });
        getContentPane().add(kKart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 639, 100, 150));

        kKart2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(kKart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 100, 150));

        kKart3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(kKart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, 100, 150));

        kKart4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(kKart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 100, 150));

        kKart5.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(kKart5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 100, 150));

        kKart6.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(kKart6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 100, 150));

        kKart7.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(kKart7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, 100, 150));

        kKart8.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(kKart8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, 100, 150));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("KARŞILAŞTIRILAN ÖZELLİK");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 350, 172, -1));

        özellik.setBackground(new java.awt.Color(0, 0, 0));
        özellik.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        özellik.setForeground(new java.awt.Color(153, 204, 255));
        özellik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        özellik.setCaretColor(new java.awt.Color(255, 255, 255));
        özellik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                özellikActionPerformed(evt);
            }
        });
        getContentPane().add(özellik, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 130, -1));

        bÖzellik.setBackground(new java.awt.Color(0, 0, 0));
        bÖzellik.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        bÖzellik.setForeground(new java.awt.Color(153, 204, 255));
        bÖzellik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bÖzellik.setCaretColor(new java.awt.Color(255, 255, 255));
        bÖzellik.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        bÖzellik.setPreferredSize(new java.awt.Dimension(100, 15));
        getContentPane().add(bÖzellik, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 70, 20));

        kÖzellik.setBackground(new java.awt.Color(0, 0, 0));
        kÖzellik.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        kÖzellik.setForeground(new java.awt.Color(153, 204, 255));
        kÖzellik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kÖzellik.setPreferredSize(new java.awt.Dimension(100, 15));
        kÖzellik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kÖzellikActionPerformed(evt);
            }
        });
        getContentPane().add(kÖzellik, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 70, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gulay\\Desktop\\backround.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

        b.setBackground(new java.awt.Color(0, 0, 0));
        b.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b.setText("Bilgisayar Skor:");
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 130, -1));

        bSkor.setBackground(new java.awt.Color(0, 0, 0));
        bSkor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        bSkor.setForeground(new java.awt.Color(255, 0, 0));
        bSkor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bSkor.setPreferredSize(new java.awt.Dimension(5, 20));
        getContentPane().add(bSkor, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, 50, 30));

        k.setBackground(new java.awt.Color(0, 0, 0));
        k.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        k.setForeground(new java.awt.Color(255, 255, 255));
        k.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        k.setText("Kullanıcı Skor:");
        getContentPane().add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, 120, -1));

        kSkor.setBackground(new java.awt.Color(0, 0, 0));
        kSkor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        kSkor.setForeground(new java.awt.Color(255, 0, 51));
        kSkor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kSkor.setPreferredSize(new java.awt.Dimension(5, 20));
        getContentPane().add(kSkor, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 551, 50, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void kÖzellikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kÖzellikActionPerformed
        
    }//GEN-LAST:event_kÖzellikActionPerformed

    private void bKart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKart1ActionPerformed
      
    }//GEN-LAST:event_bKart1ActionPerformed

    private void bKart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKart2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bKart2ActionPerformed

    private void özellikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_özellikActionPerformed
        
    }//GEN-LAST:event_özellikActionPerformed

    private void kKart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kKart1ActionPerformed
 

    }//GEN-LAST:event_kKart1ActionPerformed

    private void bOrtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrtaActionPerformed
       
    }//GEN-LAST:event_bOrtaActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Oyunekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oyunekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oyunekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oyunekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oyunekranı().setVisible(true);
                
            }
        }
        );
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b;
    public static javax.swing.JButton bKart1;
    public static javax.swing.JButton bKart2;
    public static javax.swing.JButton bKart3;
    public static javax.swing.JButton bKart4;
    public static javax.swing.JButton bKart5;
    public static javax.swing.JButton bKart6;
    public static javax.swing.JButton bKart7;
    public static javax.swing.JButton bKart8;
    public static javax.swing.JButton bOrta;
    public static javax.swing.JTextField bSkor;
    public static javax.swing.JTextField bÖzellik;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField k;
    public static javax.swing.JButton kKart1;
    public static javax.swing.JButton kKart2;
    public static javax.swing.JButton kKart3;
    public static javax.swing.JButton kKart4;
    public static javax.swing.JButton kKart5;
    public static javax.swing.JButton kKart6;
    public static javax.swing.JButton kKart7;
    public static javax.swing.JButton kKart8;
    public static javax.swing.ButtonGroup kKartButonlari;
    public static javax.swing.JButton kOrta;
    public static javax.swing.JTextField kSkor;
    public static javax.swing.JTextField kÖzellik;
    public static javax.swing.JTextField özellik;
    // End of variables declaration//GEN-END:variables


    
}
