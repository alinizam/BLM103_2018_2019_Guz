/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek9;

/**
 *
 * @author anizam
 */
public class Personel {
    String adi,soyadi;
    int maas;
    String birim;

    public Personel() {
    }
    

    public Personel(String adi, String soyadi, int maas, String birim) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
        this.birim = birim;
    }
   
    Personel(String adi, String soyadi, int maas){
        this.adi=adi;
        this.soyadi=soyadi;
        if (maas>2000)
            this.maas=maas;
        else
            this.maas=2000;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Personel siliniyor");
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
