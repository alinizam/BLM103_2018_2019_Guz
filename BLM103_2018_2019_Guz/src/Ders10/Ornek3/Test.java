/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek3;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Memur m=new Memur();
        Personel p=new Personel(10);
        p.adi="Ahmet";
        System.out.println(m.adi);
        
        p.calismaSure=15;
        System.out.println(p.getMaas());
        m.calismaSure=15;
        System.out.println(m.getMaas());
        Isci i=new Isci(10);
        System.out.println(i.getMaas());
        
        Personel p1=new Personel(10);
        System.out.println(p1.maas);
        Memur m1=new Memur();
        System.out.println(m1.maas);
    }
}
