/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek1;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String... args) {
        Matematik m=new Matematik();
        System.out.println(m.topla(1));
        System.out.println(m.topla(1,2));
        System.out.println(m.topla(1,2,6,4));
        System.out.println(m.topla(new int []{2,3,5}));
        int sayilar[]={1,5};
        System.out.println(m.topla(sayilar));
        
        System.out.println(m.toplaYaz("Sonuç = ", 1,3,5));

    }
 
}
