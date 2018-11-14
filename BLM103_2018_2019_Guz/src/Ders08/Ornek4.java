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
public class Ornek4 {

    public static void main(String[] args) {
        int[] sayilar = new int[5];
        sayilar[0] = 5;
        sayilar[1] = 4;
        sayilar[2] = 13;
        sayilar[3] = 6;
        sayilar[4] = 7;
        int enBuyuk=sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i];
            }
        }
        System.out.println("En büyük ="+enBuyuk);

    }
}
