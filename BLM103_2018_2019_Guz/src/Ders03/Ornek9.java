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
public class Ornek9 {

    public static void main(String[] args) {
        int i = 0b0101;
        i=i<<1;
        System.out.println(i );
        //0100
        i=i>>6;
        System.out.println(i);
        int x=-1; // 11111111
        System.out.println(x>>>1);
        //01111111 11111111 11111111 11111111
        
        
    }
}
