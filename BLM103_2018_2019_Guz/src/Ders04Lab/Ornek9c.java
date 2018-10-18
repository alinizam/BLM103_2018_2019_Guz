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
public class Ornek9c {
     public static void main(String[] args) {
        // ?ki say?n?n en büyük böleninin bulunmas?
        int sayi1 = 21, sayi2 = 18; 
        
        for (int bolen = (sayi1>sayi2?sayi1:sayi2)/2;bolen>0;bolen--) {
            if (sayi1 % bolen == 0 || sayi2 % bolen == 0) {
               System.out.println("En büyük bölen = " + bolen);
               break;
            }
        }
        
    }
}
