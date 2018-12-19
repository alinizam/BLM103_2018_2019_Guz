/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek1;

/**
 *
 * @author alinizam
 */
public class Fabrika {
    static String adres;
    String fabrikaAdi;
    String uretilenMarka="Tesla";
    private String uretilenModel="Model X";
    void yeniAraba(){
        Araba p=new Araba("", "");
        p.fiyat=100000;
    }
    
    class ozelAraba extends Araba{

        @Override
        void birSeylerYap(Araba p) {
            p.model=uretilenModel;
        }
    }
    
    static Bina yeniBinaOlustur(){
        Bina b=new Bina();
        b.katSayisi=3;
        b.yuzolcum=1000;
        return b;
    }
    static class Bina{
        int katSayisi, yuzolcum;
        void adresiYaz(){
            System.out.println(adres);
            
            //Hatal? kod çünkü static de?il
            //System.out.println(fabrikaAdi);
        }    
    }
    
}
 