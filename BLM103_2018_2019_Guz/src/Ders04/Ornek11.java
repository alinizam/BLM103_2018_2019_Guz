/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        int toplam = 0;
        do {
            toplam += i;
            System.out.println("Bir say? giriniz");
            i = s.nextInt();
        } while (i != -1);
        System.out.println("Toplam = " + toplam);
    }
}
