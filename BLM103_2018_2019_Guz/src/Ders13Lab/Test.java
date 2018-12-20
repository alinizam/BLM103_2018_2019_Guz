/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Personel p1 = new Personel();
        p1.adı = "Ahmet";
        p1.soyadi = "Ak";
        Personel.Ucret u1 = p1.new Ucret(0,0);
        u1.odemeYap(5000, 1000);
        
        Personel p2 = new Personel();
        p2.adı = "Mehmet";
        p2.soyadi = "Yeşil";
        Personel.Ucret u2 = p2.new Ucret(0,0);
        u2.odemeYap(2000, 1000);
        
        Personel.Avans a = new Personel.Avans(0, 0);
        a.odemeYap(3000, 0);
        
        Birim b = new Birim();
        b.personeller.add(p1);
        b.personeller.add(p2);
        
        b.getAvansıAşanlar();
        
    }
}
