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
public class Ornek3b {
    /*
     1?den 10?a kadar olan say?lar?n faktöryellerini ekrana yazd?r?n
     */

    public static void main(String[] args) {
        int n = 10;
        int sonuc = 1;

        for (int i = 1; i <= n; i++) {
            sonuc = sonuc * i;
            System.out.println(i + "! = " + sonuc);
        }

    }
}
