/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02;

/**
 *
 * @author anizam
 */
public class Ornek10 {

    public static void main(String[] args) {
        byte b = 10;
        int i=50;
        i = b;
        //Hatal? kod b=b+1;
        b = (byte)i;
        
        double d=10.5;
        i=(int)d;

    }
}
