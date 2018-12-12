/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek4;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Malzeme m=new Malzeme();
        ISekil sekil=m;
        System.out.println(sekil.getAlan());
        System.out.println(((ISekil)m).getAlan());
        
        IMalzeme malzeme=m;
        
        System.out.println(malzeme.getAdi());
        System.out.println(malzeme.getFiyat());
        
    }
}
