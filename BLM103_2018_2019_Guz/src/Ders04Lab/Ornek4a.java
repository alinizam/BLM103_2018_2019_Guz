/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author anizam
 */
public class Ornek4a {
    /*
     1?den 100?e kadar olan say?lar?, toplam en fazla 3000 olana kadar toplay?n?z
     ve kaç?nc? say?da bu toplama ula?t???n?z? ekrana yazd?r?n?z.
     */

    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 0; i < 100; i++) {
            if (toplam + i >= 3000) {
                System.out.println(i-1 + ", toplam = " + toplam);
                break;
            }
            toplam = toplam + i;
        }
    }
}
