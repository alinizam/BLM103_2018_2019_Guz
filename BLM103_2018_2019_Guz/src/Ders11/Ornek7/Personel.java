/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek7;

/**
 *
 * @author anizam
 */
public class Personel {

    String adi, soyadi;
    private int maas;
    protected int yas;

    public int getMaas() {
        if (maas < 5000) {
            return maas;
        } else {
            return 5000;
        }
    }

}
