/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab.Ornek1;

/**
 *
 * @author anizam
 */
public class Personel {

    String adi, soyadi;
    int calismaSuresi, netMaas;

    void ismiGoster() {
        System.out.println("Personelin ismi = " + adi + " " + soyadi);
    }

    String ismiDondur() {
        String isim;
        isim = adi + " " + soyadi;
        return isim;
    }
    
    void maasHesapla(){
        if(calismaSuresi < 10){
            this.netMaas = 3000;
        }
        else if(calismaSuresi >= 10){
            netMaas = 4000;
        }
    }
    
    void setCalismaSuresi(int sure){
        calismaSuresi = sure;
        maasHesapla();
    }
    
    void maasAta(int maas){
        this.netMaas=maas;
    }
    
    int maasOku(){
        return netMaas;
    }

    void setNetMaas(int netMaas) {
        this.netMaas = netMaas;
    }

    int getNetMaas() {
        return netMaas;
    }

    
    
}
