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
public class Matematik {

    void hesap(int sayilar[], String islemTuru) {
        class Topla {

            int islem(int... a) {
                int toplam = 0;
                for (int i = 0; i < a.length; i++) {
                    toplam += a[i];
                }
                return toplam;
            }
        };
        class Carpma {
            int islem(int... a) {
                int toplam = 1;
                for (int i = 0; i < a.length; i++) {
                    toplam *= a[i];
                }
                return toplam;
            }
        };
        if (islemTuru.equals("Toplama")) {
            Topla t = new Topla();
            int sonuc = t.islem(sayilar);
            System.out.println("Toplam : " + sonuc);
        }else if (islemTuru.equals("Çarpma")) {
            Carpma t = new Carpma();
            int sonuc = t.islem(sayilar);
            System.out.println("Sonuç değeri : " + sonuc);
        }

    }
}
