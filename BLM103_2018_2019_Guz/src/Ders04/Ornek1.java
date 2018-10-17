/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author anizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        int gunNo = 2;
        String sonuc = "";
        if (gunNo == 1) {
            sonuc = "Pazar";
        }
        if (gunNo == 2) {
            sonuc = "Pazartesi";
        }
        if (gunNo == 3) {
            sonuc = "Sal?";
        }
        System.out.println(sonuc);

    }
}
