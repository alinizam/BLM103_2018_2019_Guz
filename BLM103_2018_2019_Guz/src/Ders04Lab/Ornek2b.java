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
public class Ornek2b {
    /*
    n!?in de?erini hesaplayan program? yaz?n?z.
    */
    public static void main(String[] args) {
        int n = 5;
        int sonuc = 1;
        
        for (int i = n; i > 0; i--) {
            sonuc = sonuc*i;    //5*4*3*2*1
        }
        
        System.out.println(n +"! = " + sonuc);
    }
}
