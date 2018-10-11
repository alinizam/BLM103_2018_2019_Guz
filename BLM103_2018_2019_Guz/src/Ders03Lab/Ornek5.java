/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        byte sayi = 0b101;
        
        if( (sayi & 0b001) == 0){
            System.out.println("Bölünür");
        }
        else{
            System.out.println("Bölünmez");
        }
    }
}
