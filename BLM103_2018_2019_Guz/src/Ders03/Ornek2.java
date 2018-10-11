/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek2 {

    public static void main(String[] args) {
        System.out.println("Bir say? giriniz.");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println("Bir say? daha giriniz.");
        int j = s.nextInt();
        System.out.println("Toplam : " + (i + j));
        
        int a=15,b=5;
        System.out.println("Toplam : "+ (a+b));
    }
}
