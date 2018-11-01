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
public class SiviTest {

    public static void main(String[] args) {

        Sivi s1 = new Sivi();

        s1.kaynamaNoktasi = 100;
        s1.sicaklik = 80;
        s1.toplamLitre = 30;

        for (int i = 0; i < 70; i++) {
            s1.sicaklikArttir();
            s1.yazdir();
            System.out.println();
        }

    }
}
