/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08.Ornek10;

/**
 *
 * @author anizam
 */
public class ArabaTest {
    public static void main(String[] args) {
        Araba arabalar[]=new Araba[3];
        arabalar[0]=new Araba();
        
        arabalar[0].marka="Ferrari";
        System.out.println(arabalar[0].marka);
        
        arabalar[1]=new Araba();
        arabalar[2]=new Araba();
        
        arabalar[0].fiyat=2000;
        arabalar[1].fiyat=3000;
        arabalar[2].fiyat=1000;
        
        int toplam=0;
        for (int i = 0; i < arabalar.length; i++) {
            toplam+=arabalar[i].fiyat;
        }
        System.out.println("Toplam = "+toplam);
         
        toplam=0;
        for (Araba araba:arabalar){
            toplam+=araba.fiyat;
        }  
        System.out.println("Toplam = "+toplam);
        
       /* int maasToplam=0;
        for (Araba araba : arabalar) {
            maasToplam+=araba.sofor.maas;
        }*/
        
        Araba a=new Araba();
        a.fiyat=3000;
        for (int i = 0; i < 3; i++) {
            arabalar[i]=a;
        }
        System.out.println(arabalar[0].fiyat);
        a.fiyat=4000;
        System.out.println(arabalar[1].fiyat);
        System.out.println(a);
        System.out.println(arabalar[0]);
    }
}
