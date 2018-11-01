/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06.Ornek2;

/**
 *
 * @author anizam
 */
public class MatematikTest {
    public static void main(String[] args) {
        Matematik m=new Matematik();
        int x=10,y=5;
        System.out.println(m.topla(x, y)+10);
        
        
        m.topla(10,5);
        m.toplamYazdir(10, 20);
    }
}
