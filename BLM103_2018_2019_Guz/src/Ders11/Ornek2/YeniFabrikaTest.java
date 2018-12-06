/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek2;

/**
 *
 * @author anizam
 */
public class YeniFabrikaTest {
    public static void main(String[] args) {
        YeniFabrika f=new YeniFabrika();
        f.personeller[0]=new Personel();
        f.personeller[1]=new Memur();
        f.personeller[2]=new Personel();
        f.personeller[3]=new Isci();
        f.personeller[4]=new Isci();
        f.personeller[5]=new Personel();
        f.personeller[6]=new Memur();
        f.personeller[7]=new Isci();
        f.personeller[8]=new Isci();
        System.out.println(f.getToplamUcret());
        System.out.println(f.getToplamIkramiye());
        
        
    }
}
