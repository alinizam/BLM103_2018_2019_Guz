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
public class Ornek7 {

    public static void main(String[] args) {
        int sayi = 463;
        int yuzler = (sayi / 100) % 10;
        int onlar = (sayi / 10) % 10;
        int birler = (sayi / 1) % 10;
        System.out.println(yuzler + " " + onlar + " " + birler);

        int ikiyeBolunenSayisi = 0;
        ikiyeBolunenSayisi = yuzler % 2;
        ikiyeBolunenSayisi = ikiyeBolunenSayisi + onlar % 2;
        ikiyeBolunenSayisi = ikiyeBolunenSayisi + birler % 2;

        System.out.println("ikiyeBolunenSayisi = " + ikiyeBolunenSayisi);

        System.out.println(yuzler % 2 + onlar % 2 + birler % 2);

    }
}
