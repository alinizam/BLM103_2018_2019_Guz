/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab.Ornek1;

/**
 *
 * @author anizam
 */
public class PersonelTest {

    public static void main(String[] args) {
        Personel p = new Personel();
        p.adi = "Ahmet";
        p.soyadi = "Ak";
        p.ismiGoster();
        System.out.println(p.ismiDondur());
        
        p.setCalismaSuresi(5);     
        
        p.calismaSuresi=14;
        p.maasHesapla();
        
        System.out.println("maas : " + p.netMaas);        
        
        
        p.maasAta(1500);
        System.out.println("Maa? de?eri = "+p.maasOku());
    }
}
