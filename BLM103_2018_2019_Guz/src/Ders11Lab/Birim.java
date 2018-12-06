/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

/**
 *
 * @author anizam
 */
public class Birim {
    String birimAdi;
    int butce, calisanSayi;

    int getPersonelSayi(Fabrika f) {
        int sayac = 0;

        for (Personel p : f.personeller) {
            if (p.birim.birimAdi.equals(this.birimAdi)) {
                sayac++;
            }
            
            /*
            if(p.birim.equals(this)){
                sayac++;
            }
            */
        }

        return sayac;
    }


    

}
