/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01Lab;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        int a,b;
        a=5;
        b=8;
               
        System.out.println("a : "+a+" b: "+b);
        int ara=a;
        
        a=b;
        b=ara;
        System.out.println("a : "+a+" b: "+b);
        /*Alternatif*/
        
        int a1;
        int b1;
        a1=a;
        b1=b;
        a=b1;
        b=a1;
        
        System.out.println("a : "+a+" b: "+b);
        
    }
}
