/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author anizam
 */
public class Ornek9 {

    public static void main(String[] args) {
        int i = 30;
        int toplam = 0;
        while (i <= 40) {
            if (i % 2 == 0 && i%5 == 0) {
                toplam = toplam + i;
            }
            System.out.println(i + "-" + toplam);
            i++;
        }
        System.out.println(toplam);
    }
}
