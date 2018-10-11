/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author anizam
 */
public class Ornek15 {
    public static void main(String[] args) {
        int not = 15;
        
        if (not > 85) {
            System.out.println("Çok ba?ar?l?");
        } 
        else if (not >= 45 && not < 85) {
            System.out.println("Geçti");
        }
        else{
            System.out.println("Maalesef");
        }
        System.out.println("Bitti");
    }
}
