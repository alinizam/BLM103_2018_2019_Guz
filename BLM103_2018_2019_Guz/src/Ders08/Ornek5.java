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
public class Ornek5 {
    public static void main(String[] args) {
        int[] sayilar = new int[5];
        sayilar[0] = 5;
        sayilar[1] = 4;
        sayilar[2] = 13;
        sayilar[3] = 6;
        sayilar[4] = 7;
        int aranan=9;
        /*int sayac=0;
        for (int i = 0; i < sayilar.length; i++) {
            if(aranan==sayilar[i]){
                sayac++;
            } 
        }
        if (sayac>0) System.out.println("Say? var");*/
        boolean varMi=false;
        for (int i = 0; i < sayilar.length; i++) {
            if (aranan==sayilar[i]){
                varMi=true;
                break;
            }
        }
        System.out.println(varMi?"var":"yok");
    }
}
