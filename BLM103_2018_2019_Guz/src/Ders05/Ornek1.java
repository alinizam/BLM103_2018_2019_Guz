/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
       // Sat?r say?s?n? giri? olarak al 
        int n=5;
        
        //Sat?r FOR (sat?rlar için dön)
	//Sat?r?n ilk rakkam?n? olu?tur Sürekli iki kat?n? al
        int sayi=1;
	for (int i = 0; i <= n; i++) {
            // (FOR sütünlar için,  ilk sütundaki de?erden yar?s?na kadar dön, iki?erli azaltarak)
            //     Rakam?n de?erini yaz, Sat?r ba??n? sürekli iki azalt
            //END Sutun FOR
            //END Sat?r FOR
            for (int j = sayi; j >= sayi/2; j-=2) {
                System.out.print(j+" ");
            }
 
            //sat?r atla
            System.out.println("");
            sayi=sayi*2;
        }
    }
}

