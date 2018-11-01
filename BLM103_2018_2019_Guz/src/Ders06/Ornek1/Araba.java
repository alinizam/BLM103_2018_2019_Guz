/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06.Ornek1;

/**
 *
 * @author anizam
 */
class Araba {
    String model;
    String renk;
    int fiyat;
    Sofor sofor;
    int anlikHiz,sonHiz;
    void hizAta(int hiz){
        if (hiz<=sonHiz)
            anlikHiz=hiz;
    }
    int anlikHiziOku(){
        return anlikHiz;
    }    
}
