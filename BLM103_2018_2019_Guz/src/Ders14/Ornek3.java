/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author alinizam
 */
public class Ornek3 {

    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(25);
        sayilar.add(30);
        sayilar.add(16);
        System.out.println("-------------------");
        sayilar.stream()
                .map(t -> t * t)
                .forEach(System.out::println);
        System.out.println("-------------------");
        sayilar.stream()
               .filter(t->t%2==0)
               .forEach(System.out::println);
        
        double adet=sayilar.stream()
                .filter(t->t%2==0)
                .count();
        System.out.println(adet);
        
        System.out.println("----------------");
        sayilar.stream()
               .sorted()
               .forEach(System.out::println);
        
        System.out.println("----------------");
        String s=sayilar.stream()
               .sorted()
               .map(t->t+"")
               .collect(Collectors.joining(" ,"));
        System.out.println(s);
    }

}
