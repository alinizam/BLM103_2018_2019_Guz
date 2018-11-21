/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek5;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Personel> calisanlar=new ArrayList();
        Personel p1=new Personel();
        p1.maas=10000;
        Personel p2=new Personel();
        p2.maas=20000;
        
        calisanlar.add(p1);
        calisanlar.add(p2);
        
        int maasToplam=0;
        for (int i = 0; i < calisanlar.size(); i++) {
            maasToplam+=calisanlar.get(i).maas;
        }
        System.out.println("Toplam = "+maasToplam);   
    
        maasToplam=0;
        for (Personel p : calisanlar) {
            maasToplam+=p.maas;
        }
        System.out.println("Toplam = "+maasToplam );
        
        System.out.println(calisanlar.indexOf(p2));
        //Nesneyi silme ancak s?ra kalacak.
        calisanlar.set(1, null);        
    }
}
