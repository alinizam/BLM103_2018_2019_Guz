/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek1;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ogrenci {

    int ogrenciNo;
    String adi, soyadi;
    ArrayList<OgrenciNot> notlar = new ArrayList<>();

    void dersEkle(String ders) {
        int[] notlar = {50, 50, 50};
        OgrenciNot yeniDers = new OgrenciNot(this.ogrenciNo, ders, notlar);
        this.notlar.add(yeniDers);
    }

    void dersSil(String ders) {
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i).dersAdi.equals(ders)) {
                notlar.remove(i);
            }
        }
    }

    int getNotOrtalama() {
        int toplam = 0;

        for (int i = 0; i < notlar.size(); i++) {
            OgrenciNot ders = notlar.get(i);
            toplam += ders.getNotOrtalama();
        }

        return (toplam / notlar.size());
    }

    void dersleriSil(int notSinir) {
        for (int i = 0; i < notlar.size(); i++) {
            OgrenciNot dersNot = notlar.get(i);
            if (dersNot.getNotOrtalama() < notSinir) {
                notlar.remove(i);
            }
        }
    }
    
    void notArttir(int artis){
        for (int i = 0; i < notlar.size(); i++) {
            OgrenciNot dersNot = notlar.get(i);
            
            for (int j = 0; j < dersNot.notlar.length; j++) {
                dersNot.notlar[j] = dersNot.notlar[j] + artis;
            }
        }
    }
}
