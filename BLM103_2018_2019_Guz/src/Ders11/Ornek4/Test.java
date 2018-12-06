/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek4;

/**
 *
 * @author anizam
 */
public class Test {

    public static void main(String[] args) {
        Kisi Insan1 = new Isci();
        Memur Insan2 = new Memur();
        Isci Insan3 = new Isci();

        KimimOnuYaz(Insan1);
        KimimOnuYaz(Insan2);
        KimimOnuYaz(Insan3);

    }

    static void KimimOnuYaz(Kisi k) {
        k.BenKimim();
    }

}
