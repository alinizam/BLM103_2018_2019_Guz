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
public class YeniFabrika {

    Personel personeller[] = new Personel[9];

    int getToplamUcret() {
        int toplamMaas = 0;
        for (Personel p : personeller) {
            toplamMaas += p.getMaas();
        }
        return toplamMaas;
    }

    int getToplamIkramiye() {
        int toplamMaas = 0;
        for (Personel p : personeller) {
            if (p instanceof Isci) {
                toplamMaas += ((Isci) p).ikramiyeVer();
            }
        }
        return toplamMaas;
    }
}
