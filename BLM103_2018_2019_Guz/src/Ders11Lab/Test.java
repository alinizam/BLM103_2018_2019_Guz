/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

/**
 *
 * @author anizam
 */
public class Test {

    public static void main(String[] args) {
        Personel p1 = new Isci();
        Personel p2 = new Isci();
        Personel p3 = new Kadrolu();
        Personel p4 = new Kadrolu();
        Personel p5 = new Memur();
        Personel p6 = new Memur();

        Fabrika f = new Fabrika();
        f.personelEkle(p1);
        f.personelEkle(p2);
        f.personelEkle(p3);
        f.personelEkle(p4);
        f.personelEkle(p5);
        f.personelEkle(p6);
        
        for (String sayac : f.getPersonelTurAdet()) {
            System.out.println(sayac);
        }
 
       

    }

}
