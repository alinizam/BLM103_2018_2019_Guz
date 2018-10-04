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
public class Ornek9 {

    public static void main(String[] args) {
        int sayi = 146;

        /*
         int k = (sayi / 10)*10;
         int son = (sayi % 10) / 5;
        
         int yuvarlananSayi = k + son*10;
         System.out.println(yuvarlananSayi);      
         */
        int yuvarlananSayi = sayi + 5;
        yuvarlananSayi = (yuvarlananSayi / 10) * 10;
        System.out.println(yuvarlananSayi);
    }
}
