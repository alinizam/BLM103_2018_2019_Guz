/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        double sayi=12.28;
        System.out.println(sayi*100);
        System.out.println((int)(sayi*100)%10);
        int ikinciKusurat=((int)(sayi*100))%10;
        System.out.println(ikinciKusurat%2==0);
    }
}
