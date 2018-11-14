/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

/**
 *
 * @author anizam
 */
public class Ornek9 {
    public static void main(String[] args) {
        int sayilar[]={1,6,9,11,8};
        int toplam=0;
        for (int sayi : sayilar) {
           toplam+=sayi; 
        }
        System.out.println("Toplam ="+toplam);
    }
}
