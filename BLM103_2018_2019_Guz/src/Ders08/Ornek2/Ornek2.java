/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08.Ornek2;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        int i=1,j=5,k=7,l=9,m=1;
        int toplam=i+j+k+l+m;
        System.out.println(toplam);
        
       // int[] sayilar1=new int[5];
        int[] sayilar;
        sayilar=new int[5];
        sayilar[0]=5;
        sayilar[1]=4;
        sayilar[2]=3;
        sayilar[3]=6;
        sayilar[4]=7;
        
       
        
        for (int n = 0; n < 5; n++) {
             System.out.println(sayilar[n]);
        }
    
    
    }
}
