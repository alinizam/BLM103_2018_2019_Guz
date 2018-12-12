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
public class Ucgen implements ISekil{
    int k,h;

    public Ucgen(int k, int h) {
        this.k = k;
        this.h = h;
    }
    
    public int getAlan(){
        return (k*h)/2;
    }
}
