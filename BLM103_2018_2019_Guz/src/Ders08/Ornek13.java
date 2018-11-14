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
public class Ornek13 {
    public static void main(String[] args) {
         //Toplam? 10'u geçen sat?rlar hangileridir
        int sayilar[][]={{1,4,9},{1,3,1},{4,6,9}};
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam=0;
            for (int j = 0; j < sayilar[i].length; j++) {
                toplam+=sayilar[i][j]; 
            }
            if (toplam>10){ 
                System.out.println(i+".inci sat?r toplam? 10 dan büyüktür ve de?eri= "+toplam);
            }
            
        }
       
    }
}
