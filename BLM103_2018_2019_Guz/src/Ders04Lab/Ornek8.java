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
public class Ornek8 {

    public static void main(String[] args) {
        //Say?n?n bölenlerinin bulunmas?
        int sayi = 15;
        for (int bolen = 1; bolen <= sayi/2; bolen++) {
            if (sayi%bolen==0){
                System.out.println(bolen);
            }
        }
        
    }
}
