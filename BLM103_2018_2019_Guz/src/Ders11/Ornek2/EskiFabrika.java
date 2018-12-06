/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek2;

/**
 *
 * @author anizam
 */
public class EskiFabrika {
    Personel personeller[]=new Personel[3];
    Memur memurlar[]=new Memur[3];
    Isci isciler[]=new Isci[3];
    
    int getToplamUcret(){
        int toplamMaas=0;
        for (Personel p : personeller) {
            toplamMaas+=p.getMaas();
        }
        for (Isci i: isciler) {
            toplamMaas+=i.getMaas();
        }
        
        for (Memur m :  memurlar) {
            toplamMaas+=m.getMaas();
        }
        return toplamMaas;
    }
    
}
