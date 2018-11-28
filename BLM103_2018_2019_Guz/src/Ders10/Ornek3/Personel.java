/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek3;

/**
 *
 * @author anizam
 */
public class Personel {

    String adi, soyadi;
    int maas;
    int calismaSure;
    //private String tcKimlik;

    public Personel(int calismaSure) {
        this.calismaSure = calismaSure;
        maas = 1604;
    }

    public int getMaas() {
        int maas;
        if (calismaSure > 20) {
            maas = 20000;
        } else {
            maas = 10000;
        }
        this.maas = maas;
        return this.maas;
    }
}
