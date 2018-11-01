/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06.Ornek3;

/**
 *
 * @author anizam
 */
public class PersonelTest {
    public static void main(String[] args) {
        Personel p=new Personel();
        p.maas=10000;
        p.zamYap(1000);
        System.out.println(p.maas);
        int zamOran=30;
        p.zamOranDegistir(zamOran);
        System.out.println(zamOran);
        
        Personel p2=new Personel();
        Fabrika f=new Fabrika();
        p2.maas=20000;
        f.personeleZamYap(p2);
        System.out.println(p2.maas);
        System.out.println(p2);
        
        Personel p3=f.personelOlustur();
        p3.maas=1000;
        Personel p4=f.isimliPersonelOlustur("Ahmet", "Ak");
        System.out.println(p4.adi);
        
        System.out.println(f.maasKiyasla(p3, p4));
    }
}
