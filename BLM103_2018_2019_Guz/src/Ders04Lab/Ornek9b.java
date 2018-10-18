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
public class Ornek9b {

    public static void main(String[] args) {
        // ?ki say?n?n en büyük böleninin bulunmas?
        int sayi1 = 15, sayi2 = 18;
        int enBuyukBolen = 1;
        for (int bolen = 1; bolen <= sayi1 / 2 || bolen <= sayi2 / 2; bolen++) {
            if (sayi1 % bolen == 0 || sayi2 % bolen == 0) {
                enBuyukBolen = bolen;
                System.out.println(bolen);
            }
        }
        System.out.println("En büyük bölen = " + enBuyukBolen);
    }
}
