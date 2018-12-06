/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek1;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Personel[] calisanlar=new Personel[3];
        calisanlar[0]=new Personel("Ahmet", "Ak");
        calisanlar[1]=new Personel("Kemal", "Ak");
        calisanlar[2]=new Personel("Ay?e", "Ak");
        for (Personel p : calisanlar) {
            System.out.println(p.toString());
        }
        
        Personel p=new Personel(null, null);
    }
}
