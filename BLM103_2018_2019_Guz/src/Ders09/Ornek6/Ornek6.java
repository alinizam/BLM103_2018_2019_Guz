/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek6;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        ArrayList<String> kelimeler=new ArrayList();
        kelimeler.add("Ankara");
        kelimeler.add("Adana");
        kelimeler.add("Trabzon");
        
        System.out.println(kelimeler.indexOf("Adana"));
        System.out.println(kelimeler.contains("Trabzon"));
        
        
        kelimeler.remove(1);
        System.out.println(kelimeler);
        kelimeler.set(1, "Antalya");
        System.out.println(kelimeler);
    }
}
