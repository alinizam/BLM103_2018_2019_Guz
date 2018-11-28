/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek1;

/**
 *
 * @author anizam
 */
public class Personel {

    String adi, soyadi;
    String unvan;
    int maas;
    static int personelSayisi;
    final static String FIRMA="FSM";
    static String firmaAdress;

    public Personel(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
        // Hatal? kod 
        //FIRMA="ffff";
        personelSayisi++;
    }
    
    static{
        firmaAdress="Türkiye";
    }

    public Personel() {
        personelSayisi++;
    }

    public Personel(String adi, String soyadi, String unvan) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.unvan = unvan;
        personelSayisi++;

    }

    public Personel(String adi, String soyadi, String unvan, int maas) {
        personelSayisi++;
        this.adi = adi;
        this.soyadi = soyadi;
        this.unvan = unvan;
        if (this.unvan.equals("Müdür")) {
            this.maas = 50000;
        } else {
            this.maas = maas;
        }
        personelSayisi++;
    }

    public static int getPersonelSayisi() {
        return personelSayisi;
    }
    static void tumOzellikleriYaz(){
        //Hatal? kod
        //System.out.println(personelSayisi+" "+this.adi);
    }
    void tumOzellikleriYazNesne(){
        System.out.println(getPersonelSayisi()+""+this.adi);
    }

}
