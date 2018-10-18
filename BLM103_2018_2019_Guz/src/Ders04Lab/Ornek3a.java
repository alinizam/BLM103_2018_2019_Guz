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
public class Ornek3a {
    /*
     1?den 10?a kadar olan say?lar?n faktöryellerini ekrana yazd?r?n
     */

    public static void main(String[] args) {
        int n = 10;
        int sonuc;
        
        for (int i = 1; i <= n; i++) {
            sonuc = 1;
            for (int j = 1; j <= i; j++) {
                sonuc = sonuc * j;    //1*2*3*4*5
            }
            
            System.out.println(i + "! = " + sonuc);
        }
        
        
    }
}
