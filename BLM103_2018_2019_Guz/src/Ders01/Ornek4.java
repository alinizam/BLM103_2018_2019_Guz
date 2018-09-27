/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01;

/**
 *
 * @author anizam
 */
public class Ornek4 {

    public static void main(String[] args) {

        /*
         1   1
         2   1*2=2
         3   1*2*3=6
         4   1*2*3*4=24
         5   1*2*3*4*5=120   
         */
        int sayi;
        sayi = 1;
        int faktoriyel;
        faktoriyel = 1;

        System.out.println(sayi + " " + faktoriyel);
        sayi = sayi + 1;
        faktoriyel = faktoriyel * sayi;

        System.out.println(sayi + " " + faktoriyel);
        sayi = sayi + 1;
        faktoriyel = faktoriyel * sayi;

        System.out.println(sayi + " " + faktoriyel);
        sayi = sayi + 1;
        faktoriyel = faktoriyel * sayi;

        System.out.println(sayi + " " + faktoriyel);
        sayi = sayi + 1;
        faktoriyel = faktoriyel * sayi;

        System.out.println(sayi + " " + faktoriyel);
        sayi = sayi + 1;
        faktoriyel = faktoriyel * sayi;
    }

}
