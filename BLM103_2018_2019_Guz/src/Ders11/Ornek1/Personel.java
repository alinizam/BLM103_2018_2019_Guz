/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek1;

/**
 *
 * @author anizam
 */
public class Personel {
    String adi,soyadi;

    public Personel(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
    }

    @Override
    public String toString() {
        return adi+" "+soyadi; //To change body of generated methods, choose Tools | Templates.
    }
    
}
