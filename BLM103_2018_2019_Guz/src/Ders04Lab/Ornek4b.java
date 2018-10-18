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
public class Ornek4b {
    /*
     1?den 100?e kadar olan say?lar?, toplam en fazla 3000 olana kadar toplay?n?z
     ve kaç?nc? say?da bu toplama ula?t???n?z? ekrana yazd?r?n?z.
     */

    public static void main(String[] args) {
        int toplam = 0;
        int i = 0;
        
        while (i < 100 && toplam + i <= 3000) {
            toplam += i;
            i++;
        }
        
        System.out.println((i-1) + ", toplam = " + toplam);
    }
}
