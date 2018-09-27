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
public class Ornek4 {
    
    public static void main(String[] args) {
        
        int a=7;
        int b=13;
        
        a=a+b;
        b=a-b;//(a+b-b)  b=a oldu
        a=a-b;//(a+b-a)
        System.out.println("a: "+a+" b: "+b);
    }
    
}
