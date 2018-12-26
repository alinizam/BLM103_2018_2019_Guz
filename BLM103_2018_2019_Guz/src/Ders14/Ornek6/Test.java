/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Sekil<Ucgen> s;
        s=new Sekil();
        Ucgen u=new Ucgen();
        System.out.println(s.esitMi(u, u));
        
        Sekil s1=s;
        
        List<String> ls = new ArrayList<String>(); // 1
        //Hatalı kod
        //List<Object> lo = ls;
        //lo.add(new Object()); // 3
        //Hatalı kod
        //String s = ls.get(0);
    }
    
}
