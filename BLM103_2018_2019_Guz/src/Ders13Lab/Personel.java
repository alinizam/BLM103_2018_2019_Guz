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
public class Personel {

    String adı, soyadi;
    ArrayList<IOdeme> odemeler = new ArrayList<>();

    static ArrayList<IOdeme> avanslar = new ArrayList<>();

    class Ucret implements IOdeme {

        int net, vergi;

        private Ucret() {
        }

        public Ucret(int net, int vergi) {
            this.net = net;
            this.vergi = vergi;
        }

        @Override
        public void odemeYap(int net, int vergi) {
            odemeler.add(new Ucret(net, vergi));
        }

        @Override
        public int getNet() {
            return net;
        }

    }

    static class Avans implements IOdeme {

        int net, vergi;

        public Avans(int net, int vergi) {
            this.net = net;
            this.vergi = vergi;
        }

        @Override
        public void odemeYap(int net, int vergi) {
            avanslar.add(new Avans(net, vergi));
        }

        @Override
        public int getNet() {
            return net;
        }

    }

    Ucret getUcret() {
        return new Ucret();
    }

}
