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
public class Ornek16 {

    public static void main(String[] args) {
        //Verilen bir aral?kta asal say? var m??
        dis:
        for (int i = 7; i < 10; i++) {
            for (int j = 2; j <= i / 2; j++) {
                System.out.println(i+" : "+j);
                if (i % j == 0) {
                    System.out.println("Asal olmayan say? var : " + i);
                    break dis;
                }
            }
        }
    }
}
