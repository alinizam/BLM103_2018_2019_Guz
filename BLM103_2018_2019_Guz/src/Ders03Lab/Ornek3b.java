/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author anizam
 */
public class Ornek3b {

    public static void main(String[] args) {
        int sayi = 8;       // 5 - 15 aral???nda bir say?
        int sayac = 0;

        if (sayi % 2 == 0) {
            sayac++;
            sayi = sayi / 2;
        }
        if (sayi % 2 == 0) {
            sayac++;
            sayi = sayi / 2;
        }
        if (sayi % 2 == 0) {
            sayac++;
            sayi = sayi / 2;
        }
        
        System.out.println("sayac : " + sayac);
    }
}
