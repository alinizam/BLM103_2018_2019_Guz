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
public class ArabaTest1 {
    public static void main(String[] args) {
        int i;
        i=5;
        i=i+5;
        
        Araba mercedes;
        mercedes=new Araba();
        mercedes.fiyat=1000000;
        mercedes.model="C";
        mercedes.renk="Siyah";
        System.out.println("Benim arabam " + mercedes.model );
        
        Araba a=new Araba();
        a.sonHiz=180;
        int hiz=500;
        /*if (hiz<a.sonHiz)
            a.anlikHiz=hiz;
        System.out.println(a.anlikHiz);*/
        a.hizAta(hiz);
        System.out.println(a.anlikHiz);
    }
}
