/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek2;

/**
 *
 * @author alinizam
 */
public class Kapsayan {
    String sinifAdi="D?? s?n?f";
    Ic i=new Ic();
    static String sinifTuru;
    Ic getIcSinif(){
        return new Ic();
    }
    void yazdirIcSinifAdi(){
        System.out.println(i.sinifAdi);
    }
     void yazdirDisSinifAdi(){
        System.out.println(sinifAdi);
    }
    class Ic{
        String sinifAdi="?ç s?n?f";
        void yazdirSinifAdi(){
            System.out.println(sinifAdi);
        }
        void yazdirDisSinifAdi(){
            System.out.println(Kapsayan.this.sinifAdi);
        }
    }
    static class statikGomulu{
         String sinifTuru;
           void yazdir(){
               System.out.println(Kapsayan.sinifTuru);
           }
    }
}
