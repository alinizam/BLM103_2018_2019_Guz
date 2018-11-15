/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab.Ornek2;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Fabrika f=new Fabrika();
        Personel p1=new Personel();
        p1.unvan="Memur";
        p1.adi="Ahmet";
        p1.soyadi="Ak";
        p1.maas=5000;
        f.personelEkle(p1);
        Personel p2=new Personel();
        p2.unvan="Memur";
        p2.adi="Mehmet";
        p2.soyadi="Ak";
        p2.maas=7000;
        f.personelEkle(p2);
        Personel p3=new Personel();
        p3.unvan="??çi";
        p3.adi="Ay?e";
        p3.soyadi="AK";        
        p3.maas=6000;
        f.personelEkle(p3);
        
        System.out.println(f.toplamMaas("Memur"));
        
        f.ismeZamYap("Ahmet", "Ak", 10000);
        System.out.println(f.calisanlar[0].maas);
        
        f.dusukMaasaZamYap(7000, 3000);
        System.out.println(f.calisanlar[0].maas);
        
    }
}
