/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab.Ornek1;

/**
 *
 * @author anizam
 */
public class Saat {

    int saat, dakika, saniye;

    void saniyeArttir() {
        saniye++;
        if (saniye == 60) {
            saniye = 0;
            dakikaArttir();
        }
    }

    void dakikaArttir() {
        dakika++;
        if (dakika == 60) {
            dakika = 0;
            saatArttir();
        }
    }

    void saatArttir() {
        saat++;
        if (saat == 24) {
            saat = 0;
            //gunArttir();
        }
    }

    void saatKac() {
        System.out.println(saat + " : " + dakika + " : " + saniye);
    }
}
