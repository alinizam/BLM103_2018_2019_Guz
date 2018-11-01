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
public class ArabaSoforTest {
    public static void main(String[] args) {
        Araba a=new Araba();
        a.sofor=new Sofor();
        a.sofor.adi="Ahmet";
        a.sofor.soyadi="Ak";
        System.out.println(a.sofor.adi +" "+a.sofor.soyadi);
    }
}
