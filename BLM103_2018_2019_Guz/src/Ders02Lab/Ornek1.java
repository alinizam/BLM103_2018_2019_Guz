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
public class Ornek1 {

    public static void main(String[] args) {
        int i = 78;

        int onlar = i / 10;
        int birler = i % 10;
       // int birler = i - onlar*10;

        int yeniSayi = onlar + birler * 10;
        System.out.println(yeniSayi);

    }
}
