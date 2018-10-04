/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        int i = 8;
    //  boolean ciftMi=(i%2 < 1); 
        boolean ciftMi=(i%2 == 0); 
        System.out.println(ciftMi);
        
        //Alternatif Çözüm
        System.out.println(i%2 == 0);
        
    }
}
