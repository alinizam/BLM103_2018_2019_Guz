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
public class Ornek2a {
    public static void main(String[] args) {
        int sayi1 = 5;
        int sayi2 = 35;
        int sayi3 = 25;
        
        int enBuyuk;
        
        enBuyuk = (sayi1 > sayi2) ? sayi1 : sayi2;
        enBuyuk = (enBuyuk > sayi3) ? enBuyuk : sayi3;
        
        System.out.println("enBuyuk : " + enBuyuk);
    }
}
