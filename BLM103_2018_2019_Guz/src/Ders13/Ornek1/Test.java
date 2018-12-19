/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek1;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Fabrika.Bina bina=new Fabrika.Bina();
        Fabrika.adres="?stanbul";
        bina.adresiYaz();
        
        
        Fabrika.Bina bina1=Fabrika.yeniBinaOlustur();
        System.out.println(bina1.katSayisi);
        
    }
}
