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
public class Ornek9 {
    public static void main(String[] args) {
        // ?ki say?n?n en büyük böleninin bulunmas?
        int sayi1 = 15;
        int  sayi1EnBuyukBolen=1;
        for (int bolen = 1; bolen <= sayi1/2; bolen++) {
            if (sayi1%bolen==0){
                sayi1EnBuyukBolen=bolen;
                System.out.println(bolen);
            }
        }
        
        int sayi2= 18;
        int  sayi2EnBuyukBolen=1;
        for (int bolen = 1; bolen <= sayi2/2; bolen++) {
            if (sayi2%bolen==0){
                sayi2EnBuyukBolen=bolen;
                System.out.println(bolen);
            }
        }
        if (sayi1EnBuyukBolen>sayi2EnBuyukBolen){
            System.out.println("En büyük bölen = "+ sayi1EnBuyukBolen);
        }else{
            System.out.println("En büyük bölen = "+ sayi2EnBuyukBolen);
        }
    }
}
