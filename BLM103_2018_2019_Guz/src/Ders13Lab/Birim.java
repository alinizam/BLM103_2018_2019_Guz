/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Birim {

    String birimAdi;
    ArrayList<Personel> personeller = new ArrayList<>();

    void getAvansıAşanlar() {
        int toplamAvans = 0;
        for (IOdeme avans : Personel.avanslar) {
            toplamAvans += ((Personel.Avans) avans).net;
        }

        for (Personel p : personeller) {
            int toplamOdeme = 0;

            for (IOdeme odeme : p.odemeler) {
                toplamOdeme += ((Personel.Ucret) odeme).net;
            }

            if (toplamOdeme > toplamAvans) {
                System.out.println(p.adı + " " + p.soyadi);
            }
        }

    }

    void personeleOdemeEkleYerel(Personel p) {
        class YerelOdeme implements IOdeme {

            int net, vergi;

            @Override
            public void odemeYap(int net, int vergi) {
                if (birimAdi.equals("GM")) {
                    this.net = 10000;
                } else {
                    this.net = 9000;
                }
            }

            @Override
            public int getNet() {
                return net;
            }

        }

        YerelOdeme yOdeme = new YerelOdeme();
        yOdeme.odemeYap(0, 0);
        p.odemeler.add(yOdeme);
    }

    void personeleOdemeEkleAnonim(Personel p) {
        IOdeme anonimOdeme = new IOdeme() {
            int net, vergi;

            @Override
            public void odemeYap(int net, int vergi) {
                if (birimAdi.equals("GM")) {
                    this.net = 10000;
                } else {
                    this.net = 9000;
                }
            }

            @Override
            public int getNet() {
                return net;
            }
        };
        
        anonimOdeme.odemeYap(0, 0);
        p.odemeler.add(anonimOdeme);
    }
}
