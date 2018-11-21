/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek3;

import Ders09.Ornek2.Personel;
import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        ArrayList<Integer> maaslar=new ArrayList();
        maaslar.add(10000);
        maaslar.add(20000);
        maaslar.add(30000);
        int toplam=0;
        for (int maas : maaslar) {
            toplam+=maas;
        }
        System.out.println("Toplam = "+toplam);
    }
}
