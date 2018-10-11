/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author anizam
 */
public class Ornek8 {
    public static void main(String[] args) {
        int i=13, j=10;  
        // 13 1101, 
        // 10 1010
        //    1000
        // i=0b1101;
        // j=0b1010;
        System.out.println(i & j);
        
        // 13 00001101  11110010
        System.out.println(~1);
        //00000001  1111 1110  126
        System.out.println(0b1111110);
        
    }
}
