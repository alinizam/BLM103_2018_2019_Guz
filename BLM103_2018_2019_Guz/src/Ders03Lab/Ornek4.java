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
public class Ornek4 {

    public static void main(String[] args) {
        char karakter = 'a';
        int ASCII = (int) karakter;

        if (ASCII >= 97 && ASCII <= 122) {   // K���k harfler 97-122
            System.out.println("K���k harfler 97-122");
        } 
        else if (ASCII >= 65 && ASCII <= 90) {     //B�y�k harfler 65-90
            System.out.println("B�y�k harfler 65-90");
        } 
        else {
            System.out.println("Hatal?");
        }
    }
}
