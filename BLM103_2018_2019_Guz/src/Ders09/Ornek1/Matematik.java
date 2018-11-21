/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek1;

/**
 *
 * @author anizam
 */
public class Matematik {
    int topla(int... sayilar){
        int toplam=0;
        for (int sayi : sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }
    
     String toplaYaz(String s,int... sayilar){
        int toplam=0;
        for (int sayi : sayilar) {
            toplam+=sayi;
        }
        return s+" - "+toplam;
    }
}
