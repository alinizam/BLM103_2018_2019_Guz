/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06.Ornek1;

/**
 *
 * @author anizam
 */
public class ArabaTest2 {
    public static void main(String[] args) {
        Araba a1;
        a1=new Araba();
        Araba a2;
        a2=new Araba();
        a2=a1;
        a1.fiyat=50000;
        System.out.println(a1.fiyat);
        System.out.println(a2.fiyat);
        
        
        
        
        
    }
}
