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
public class Ornek7 {
    public static void main(String[] args) {
        int sayi = 5;
        
        if(sayi % 4 == 0){
            System.out.println("4 e bölünür");
        }
        else if(sayi % 3 == 0){
            System.out.println("3 e bölünür");
        }
        else if(sayi % 2 == 0){
            System.out.println("2 e bölünür");
        }
        else{
            System.out.println("1 e bölünür");
        }
    }
}
