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
public class Ornek12 {
     public static void main(String[] args) {
        int n=5;
        int sayi=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n-i-1; j++) {
                System.out.print(sayi++ + "\t"); 
            }
            System.out.println("");
        }
    }
}
