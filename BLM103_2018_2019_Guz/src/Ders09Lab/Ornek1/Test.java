/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek1;

/**
 *
 * @author anizam
 */
public class Test {

    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci();

        OgrenciNot n1 = new OgrenciNot(o1.ogrenciNo, "BLM103", new int[]{70, 80});
        OgrenciNot n2 = new OgrenciNot(o1.ogrenciNo, "BLM104", new int[]{80, 90});
        OgrenciNot n3 = new OgrenciNot(o1.ogrenciNo, "BLM202", new int[]{90, 100});

        o1.notlar.add(n1);
        o1.notlar.add(n2);
        o1.notlar.add(n3);

        System.out.println("genel ortalama : " + o1.getNotOrtalama());
        System.out.println("not1 ortalama : " + n1.getNotOrtalama());
        System.out.println("not2 ortalama : " + n2.getNotOrtalama());
        System.out.println("not3 ortalama : " + n3.getNotOrtalama());

        o1.dersSil("BLM103");
        System.out.println("genel ortalama : " + o1.getNotOrtalama());
        
        o1.notArttir(10);
        System.out.println("genel ortalama : " + o1.getNotOrtalama());
        System.out.println("not1 ortalama : " + n1.getNotOrtalama());
        System.out.println("not2 ortalama : " + n2.getNotOrtalama());
        System.out.println("not3 ortalama : " + n3.getNotOrtalama());
    }
}





