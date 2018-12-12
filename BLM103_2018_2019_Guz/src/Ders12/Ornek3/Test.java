/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek3;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        ISekil sekil=new Ucgen(1,6);
        System.out.println(sekil.getAlan());
        sekil=new Kare(5);
        System.out.println(sekil.getAlan());
        
        sekilAlanYazdir(new Ucgen(1,6));
        sekilAlanYazdir(new Kare(5));
    }
    static void sekilAlanYazdir(ISekil sekil){
        System.out.println(sekil.getAlan());
         
    }

}
