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
public class Fabrika {
    void personeleZamYap(Personel p){
        p.maas=(p.maas*110)/100;
        System.out.println(p);    
    }
    
    Personel personelOlustur(){
        Personel p=new Personel();
        return p;
    }
    
    Personel isimliPersonelOlustur(String adi,String soyadi){
        Personel p=new Personel();
        p.adi=adi;
        p.soyadi=soyadi;
        return p;
               
    }
    //iki tane personelin maa?? ayn? m? kontrol eden metodu yaz?n?z.
    
    boolean maasKiyasla(Personel p1, Personel p2){
        return p1.maas==p2.maas;
    }
    
    
}
