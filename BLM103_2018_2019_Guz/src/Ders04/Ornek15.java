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
public class Ornek15 {
    public static void main(String[] args) {
        // VErilen bir aral?kta 7'ye bölünen bir say? var m?d?r. Kontrol ediniz.
        int altsinir=6,ustSinir=130000;
        for (int i = altsinir; i <= ustSinir; i++) {
            if (i%7==0) {
                System.out.println("Yediye böülen bir say? var.");
                break;
            }
        }
        System.out.println("Bitti");
    }
}
