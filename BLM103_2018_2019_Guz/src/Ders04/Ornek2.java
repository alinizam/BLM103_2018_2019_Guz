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
public class Ornek2 {

    public static void main(String[] args) {
        int gunNo = 2;
        String sonuc = "";
        switch (gunNo) {
            case 1:
                sonuc = "Pazar";
                break;
            case 2:
                sonuc = "Pazartesi";
                break;
            case 3:
                sonuc = "Sal?";
                break;
        }
        System.out.println(sonuc);
    }
}
