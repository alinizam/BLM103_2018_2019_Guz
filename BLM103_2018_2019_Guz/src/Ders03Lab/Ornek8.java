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
public class Ornek8 {
    /*
     �� basamakl? ikili sistemdeki bir say?da ka� adet 1 rakam? ge�ti?ini bulunuz.
     0b110    	- 2
     0b001    	- 1
     Bit d�zeyindeki operat�rleri kullan?n?z. 
     & 		- and
     |		- or
     <<		- shift left
     */

    public static void main(String[] args) {
        int sayi = 0b111;
        int bitKontrol = 0b001;
        int sayac = 0;
        if ((sayi & bitKontrol) > 0) {
            sayac++;
        }
        bitKontrol = bitKontrol << 1;
        if ((sayi & bitKontrol) > 0) {
            sayac++;
        }
        bitKontrol = bitKontrol << 1;
        if ((sayi & bitKontrol) > 0) {
            sayac++;
        }
        System.out.println("?kili sistemdeki bir say?s? = " +sayac);
        
    }

}
