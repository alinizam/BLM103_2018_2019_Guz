/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ornek2 {

    public static void main(String[] args) {
        ArrayList<String> kelimeler = new ArrayList();
        kelimeler.add("İstanbul");
        kelimeler.add("Ankara");
        kelimeler.add("İzmir");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }
        kelimeler.stream().forEach(kelime -> System.out.println());
        kelimeler.stream().map(s->s+"a").forEach(System.out::println);
        
        

    }
}
