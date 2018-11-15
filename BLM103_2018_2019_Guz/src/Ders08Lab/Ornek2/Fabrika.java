/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab.Ornek2;

/**
 *
 * @author anizam
 */
public class Fabrika {
    Personel[] calisanlar=new Personel[3];
    int toplamMaas(String unvan){
        int toplam=0;
        for (Personel c : calisanlar) {
            if (c.unvan.equals(unvan)){
                toplam+=c.maas;
            }
        }
        return toplam;
    }
    void personelEkle(Personel p){
        for (int i = 0; i < calisanlar.length; i++) {
            if (calisanlar[i]==null){
                calisanlar[i]=p;
                break;
            }
        }
    
    }
    void ismeZamYap(String adi, String soyadi, int zam){
        for (Personel p : calisanlar) {
            if (p.adi.equals(adi) && p.soyadi.equals(soyadi)){
                p.maas+=zam;
            }
        }
    }
     void dusukMaasaZamYap(int maasDuzeyi, int zam){
        for (Personel p : calisanlar) {
            if (p.maas<maasDuzeyi){
                p.maas+=zam;
            }
        }
    }
    
}
