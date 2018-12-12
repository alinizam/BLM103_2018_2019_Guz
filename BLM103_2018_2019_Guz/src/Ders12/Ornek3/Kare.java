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
public class Kare implements ISekil{
    int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

   
    public int getAlan() {
        return kenar*kenar;
    }
     
}
