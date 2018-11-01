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
public class SaatTest {
    public static void main(String[] args) {
        
        Saat s1 = new Saat();
        
        s1.saat = 17;
        s1.dakika = 58;
        s1.saniye = 59;
        
        for (int i = 0; i < 121; i++) {
            s1.saniyeArttir();
            s1.saatKac();
        }
    }
}
