/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek3;

/**
 *
 * @author alinizam
 */
public class Personel {
    String adi, soyadi,unvan;
    int maas;

    public Personel(String adi, String soyadi, String unvan, int maas) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.unvan = unvan;
        this.maas = maas;
    }
        public Personel( String unvan, int maas) {
        this.unvan = unvan;
        this.maas = maas;
    }
}
