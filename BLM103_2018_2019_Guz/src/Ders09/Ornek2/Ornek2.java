/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek2;

import java.util.ArrayList;

 

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        ArrayList iller=new ArrayList();
        iller.add("Ankara");
        iller.add("?stanbul");
        iller.add("?zmir");
        iller.add(new Personel());
        iller.add(5);
        System.out.println(iller);
    }
}
