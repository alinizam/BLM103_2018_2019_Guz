/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

/**
 *
 * @author anizam
 */
public class Ornek3 {

    public static void main(String[] args) {
        int[] sayilar = new int[5];
        sayilar[0] = 5;
        sayilar[1] = 4;
        sayilar[2] = 3;
        sayilar[3] = 6;
        sayilar[4] = 7;
        System.out.println(sayilar[0] + sayilar[1] + sayilar[2]
                + sayilar[3] + sayilar[4]);
        
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam = toplam + sayilar[i];
            System.out.println(i+" "+sayilar[i]+" "+" "+toplam);
        }
        System.out.println("Toplam = "+toplam);

    }
}
