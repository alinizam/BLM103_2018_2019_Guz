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
public class DownCastTest {
    public static void main(String[] args) {
        Personel p;
        p=new Isci();
        //?lave kontrol gerekli.
        Isci i=(Isci)p;
        System.out.println(i.ikramiyeVer());
        System.out.println(p instanceof Personel);       
    }
 
}
