/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Pencere p=new Pencere();
        p.setXY(10, 20, 20, 30);
        
        Buton b=new Buton();
        b.setXY(10, 20, 20, 30);
        
        IHareket cisim=p;
        cisim.hareketEt(50);
        cisim.konumuYazdir();
        
        cisim=b;
        cisim.hareketEt(50);
        cisim.konumuYazdir();
        
//        IHareket bilesen = new Buton();
//        Ekran ekran = new Ekran();
//        ekran.bilesenEkle(bilesen);
//        ekran.bilesenEkle(b);
//        ekran.bilesenEkle(p);
//        System.out.println(ekran.bilesenler.size());
//        
//        System.out.println(ekran.getToplamAlan());
    }
}
