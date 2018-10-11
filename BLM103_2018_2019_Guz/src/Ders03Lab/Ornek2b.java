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
public class Ornek2b {
    /*
        Verilen üç say?dan en büyük olan?n? bulunuz.
    */
    public static void main(String[] args) {
        int sayi1 = 5, sayi2 = 35, sayi3 = 25;
        
        if(sayi1 > sayi2 && sayi1 > sayi3){
            System.out.println("enBuyuk : " + sayi1);
        }
        else if(sayi2 > sayi1 && sayi2 > sayi3){
            System.out.println("enBuyuk : " + sayi2);
        }
        else{
            System.out.println("enBuyuk : " + sayi3);
        }
        
        
        
    }
}
