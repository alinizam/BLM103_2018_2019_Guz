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
public class Ornek1b {

    public static void main(String[] args) {
        int not = 45;
        String harfNot = "";
        if (not < 45) {
            harfNot = "FF";
        } else if (not < 70) {
            harfNot = "CC";
        } else if (not <= 100) {
            harfNot = "AA";
        } else {
            harfNot = "Hata";
        }
        System.out.println("Harf Notu: " + harfNot);
    }
}
