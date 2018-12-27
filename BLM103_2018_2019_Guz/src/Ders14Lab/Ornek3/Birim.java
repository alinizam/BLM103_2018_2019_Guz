/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek3;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author alinizam
 */
public class Birim {

    ArrayList<Personel> personeller = new ArrayList();

    void personelIsimleriniYaz() {
        personeller.stream().forEach(p -> System.out.println(p.adi + "" + p.soyadi));
    }

    long getUnvanAdetToplam(String u) {
        long toplam = personeller.stream().filter(p -> p.unvan.equals(u)).count();
        return toplam;
    }

    int getUnvanMaasToplam(String u) {
        int toplam = personeller.stream()
                .filter(p -> p.unvan.equals(u))
                .collect(Collectors.summingInt(p -> p.maas));
        return toplam;
    }

    void calisanlaraZamYap(IZam zamIslem) {
        personeller.stream().forEach(p1->zamIslem.zamYap(p1));
      
    } 
    
}
