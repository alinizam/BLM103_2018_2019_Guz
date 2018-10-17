/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i;
        System.out.println("Bir say? giriniz. Bitirmek için -1 girin.");
        i=s.nextInt();
        int toplam=0;
        while(i!=-1){
            toplam+=i;
            System.out.println("Bir say? daha giriniz. Bitirmek için -1 girin.");
            i=s.nextInt();
        }
        System.out.println("Toplam = "+ toplam);
    }
}
