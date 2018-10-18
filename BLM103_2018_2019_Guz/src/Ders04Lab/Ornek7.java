/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    /*
     A) 1 ile 20 aras?ndaki çift say?lar? ekrana yazd?r?n?z.
     B) 1 ile 200 aras?ndaki 7?nin katlar?n? ekrana yazd?r?n?z.
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");

        int k = 1;
        while (k < 200) {
            if (k % 7 == 0) {
                System.out.print(k + " ");
            }
            k++;
        }
    }
}