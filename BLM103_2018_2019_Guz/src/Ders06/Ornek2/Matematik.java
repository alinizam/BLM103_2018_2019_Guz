/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06.Ornek2;

/**
 *
 * @author anizam
 */
public class Matematik {
    //iki say?y? toplayan ve döndüren metot
    int topla(int a,int b){
        int sonuc;
        sonuc=a+b;
        return sonuc; 
    }
    //iki say?y? toplayan ve toplam? sadece yazd?ran metot
    
    void toplamYazdir(int a,int b){
        System.out.println(a+b);
    }
    
    int mutlakDeger(int i){
        /*if (i<0)
            return -1*i;
        else
            return i;*/
        int sonuc=i;
        if (i<0)
            sonuc=-1*i; 
        return sonuc;   
    }
    
}
