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
public class Test {
    public static void main(String[] args) {
        Personel p1=new Personel();
        Personel p2=new Personel();
        Personel p3=new Personel();
       
        //HAtal? Kod
        //p1.FIRMA="FSM";
        //Personel.FIRMA="FSM";

        System.out.println(p2.FIRMA);
        System.out.println(Personel.FIRMA);
        Personel p4=new Personel("","");
        Personel p5=new Personel("","","");
        System.out.println(Personel.personelSayisi);
        System.out.println(Personel.getPersonelSayisi());
        
        setFirmaAdres();
        yazFirmaAdres();
    }
   
    
    static void setFirmaAdres(){
        Personel.firmaAdress="?stanbul";
    }
    static void yazFirmaAdres(){
        System.out.println(Personel.firmaAdress);
    }
}
