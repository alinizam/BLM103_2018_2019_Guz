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
public class Ornek4 {
    public static void main(String[] args) {
        int i=1,x;
        x=(3*i++)+i+++(i--);
           //3 i=2  2  i=3 3 i=2
        System.out.println("x ="+x+"    i ="+i);
    }
}
