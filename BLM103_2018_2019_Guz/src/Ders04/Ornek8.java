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
public class Ornek8 {
    public static void main(String[] args) {
        int i = 1;
        int toplam=0;
        while (i <= 10) {
            toplam=toplam+i;
            System.out.println(i+"-"+toplam);
            i++;
        }
        System.out.println(i);
    }
}
