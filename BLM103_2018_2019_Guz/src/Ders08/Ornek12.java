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
public class Ornek12 {
    public static void main(String[] args) {
        //Tüm matris toplam?
        int sayilar[][]={{1,4,5},{1,3,1},{4,6,1}};
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                toplam+=sayilar[i][j];
            }
        }
        System.out.println("Toplam = "+toplam);
        
    }
}
