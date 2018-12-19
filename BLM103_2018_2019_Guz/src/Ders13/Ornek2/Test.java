/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek2;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        //Tek a?ama
        Kapsayan.Ic icOrnek1=(new Kapsayan()).new Ic();
        
        //?ki a?ama
        
        Kapsayan k=new Kapsayan();
        Kapsayan.Ic icOrnek2=k.new Ic();
        
        //3. Yöntem metotlu
        
        Kapsayan.Ic icOrnek3=k.getIcSinif();
        
        
    }
}
