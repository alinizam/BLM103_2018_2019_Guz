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
public class Ornek7 {
    //isimli bloklarda kapsam ve görünürlük
    static int y = 4;    
    public static void main(String[] args) {
        System.out.println(y);
        int y=8;
        System.out.println(y);
    }
    
}
