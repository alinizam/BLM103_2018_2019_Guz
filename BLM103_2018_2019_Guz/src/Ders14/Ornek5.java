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
public class Ornek5 {
    public static void main(String[] args) {
        ArrayList<String> nesneler=new ArrayList();
        nesneler.add("Ankara");
        nesneler.add("İstanbul");
     
        for (Object object : nesneler) {
            System.out.println((String)object);
        }
    }
     public static void main1(String[] args) {
        ArrayList nesneler=new ArrayList();
        nesneler.add("Ankara");
        nesneler.add("İstanbul");
        nesneler.add(1230);
        
        for (Object object : nesneler) {
            System.out.println((String)object);
        }
    }
 
}
