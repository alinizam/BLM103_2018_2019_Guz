/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    /*
    
    A ki?isi B ki?ine X TL borç para verdi?inde, 
    B ki?isi de Y ve Z TL ?eklinde iki defada geri ödeme yapt???nda A ve B ki?isinin mevcut parasal varl???ndaki de?i?im nas?l olur? Borcun tamam?yla geri ödendi?i nas?l kontrol edilebilir. Gerekli de?i?kenleri tan?mlayarak kodlay?n?z.

    */
    
    public static void main(String[] args) {
        int A=100,B=50;
        int X=20,Y=10,Z=10;
        
        A=A-X+(Y+Z);
        B=B+X-(Y+Z);
        System.out.println("A'n?n mal varl??? = "+ A);
        System.out.println("B'n?n mal varl??? = "+ B);
        
        if (X==(Y+Z)) System.out.println("Tüm borç ödendi");
        else System.out.println("Borç ödenmedi");
    }
}
