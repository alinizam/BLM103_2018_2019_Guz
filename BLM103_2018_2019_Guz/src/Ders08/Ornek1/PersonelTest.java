/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08.Ornek1;

/**
 *
 * @author anizam
 */
public class PersonelTest {
    public static void main(String[] args) {
       //Object o = new Object();
        Personel p1=new Personel();
        Personel p2=p1;
        System.out.println(p1.equals(p2));
        
        System.out.println(p1.toString());
        
    }
}
