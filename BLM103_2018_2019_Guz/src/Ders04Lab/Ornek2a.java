/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author anizam
 */
public class Ornek2a {
    /*
    n!?in de?erini hesaplayan program? yaz?n?z.
    */
    public static void main(String[] args) {
        int n = 5;
        int sonuc = 1;
        
        for (int i = 1; i <= n; i++) {
            sonuc = sonuc*i;    //1*2*3*4*5
        }
        
        System.out.println(n +"! = " + sonuc);
    }
}
