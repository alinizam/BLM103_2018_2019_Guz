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
public class Sivi {

    int sicaklik, toplamLitre, kaynamaNoktasi;

    void buharlas() {
        if (toplamLitre > 0) {
            toplamLitre--;
        }
    }
    
    int sicaklikArttir(){
        if(sicaklik < kaynamaNoktasi){
            sicaklik++;
        }
        else if(sicaklik == kaynamaNoktasi){
            buharlas();
        }
        
        if (toplamLitre > 0) {
            return toplamLitre;
        }
        else{
            return -1;
        }
    }
    
    void yazdir(){
        System.out.println("kalan sivi miktari : " + toplamLitre);
        System.out.println("son sicaklik : " + sicaklik);
    }
}
