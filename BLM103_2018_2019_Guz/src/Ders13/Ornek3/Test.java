/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek3;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Matematik m = new Matematik();
        m.hesap(new int[]{1,2,4,1,2}, "Toplama");
        m.hesap(new int[]{1,2,4,1,2}, "Çarpma");
        
        Matematik1 m1=new Matematik1();
        m1.hesap(new int[]{1,2,4,1,2}, "Toplama");
    }
}
