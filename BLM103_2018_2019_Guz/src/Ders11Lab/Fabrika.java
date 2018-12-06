/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Fabrika {

    ArrayList<Personel> personeller = new ArrayList<>();
    Birim[] birimler = new Birim[3];

    void personelEkle(Personel p) {
        personeller.add(p);
    }

    String[] getPersonelTurAdet() {
        String[] sonuc = {"Kadrolu", "Sozlesmeli", "Memur", "Isci", "Personel"};
        int[] sayac = new int[5];

        for (Personel p : personeller) {
            if (p instanceof Kadrolu) {  //sayac[0]
                sayac[0]++;
            } else if (p instanceof Sozlesmeli) {  //sayac[1]
                sayac[1]++;
            } else if (p instanceof Memur) {  //sayac[2]
                sayac[2]++;
            } else if (p instanceof Isci) {  //sayac[3]
                sayac[3]++;
            } else if (p instanceof Personel) {  //sayac[4]
                sayac[4]++;
            }
        }

        for (int i = 0; i < sonuc.length; i++) {
            sonuc[i] += " : " + sayac[i];
        }

        return sonuc;
    }

    Personel getUzunCalisan() {
        Personel sonuc = null;
        int enUzunSure = 0;

        for (Personel p : personeller) {
            if (p instanceof Sozlesmeli) {
                if (((Sozlesmeli) p).sozlesmeSuresi > enUzunSure) {
                    enUzunSure = ((Sozlesmeli) p).sozlesmeSuresi;
                    sonuc = p;
                }
            }
        }

        return sonuc;
    }

    void setCalisanSayi() {
        for (Personel p : personeller) {
            p.birim.calisanSayi++;
        }
    }

    void setCalisanSayi2() {
        for (Birim b : birimler) {
            for (Personel p : personeller) {
                if (p.birim.birimAdi.equals(b.birimAdi)) {
                    b.calisanSayi++;
                }
            }
        }
    }

}
