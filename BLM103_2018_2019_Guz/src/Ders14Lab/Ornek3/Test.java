/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek3;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Birim b=new Birim();
        b.personeller.add(new Personel("A", 10));
        b.personeller.add(new Personel("A", 15));
        b.personeller.add(new Personel("B", 10));
      //b.personelIsımleriniYaz();
        System.out.println(b.getUnvanMaasToplam("B"));
        
        IZam zamIslem = ((p) -> {
            if (p.maas > 5000) {
                p.maas *= 1.1;
            }});
        b.calisanlaraZamYap(zamIslem);
        
    }
}
