/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek9;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
       /* Personel p1=new Personel();
        p1.adi="Ahmet";
        p1.soyadi="Ak";
        p1.maas=1000;*/
        Personel p1=new Personel("Ahmet","Ak",500);
        System.out.println(p1.adi+" "+p1.soyadi+" "+p1.maas);
        
        ArrayList<Personel> calisanlar=new ArrayList();
        calisanlar.add(new Personel("Ahmet","Ak",500));
        calisanlar.add(new Personel("Mehmet","Ak",500));
        
        //Personel p=new Personel();
        Fabrika f=new Fabrika();
    }
}
