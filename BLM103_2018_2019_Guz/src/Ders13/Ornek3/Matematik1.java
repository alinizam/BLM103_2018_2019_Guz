/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek3;

/**
 *
 * @author alinizam
 */
public class Matematik1 {
     void hesap(int sayilar[], String islemTuru) {
        int sayi=0;
        class Topla {
            int islem() {
                int toplam = 0;
                for (int i = 0; i < sayilar.length; i++) {
                    toplam += sayilar[i];
                }
                return toplam+sayi;
            }
        }
        Topla t=new Topla();
        System.out.println(t.islem());
     }
}
