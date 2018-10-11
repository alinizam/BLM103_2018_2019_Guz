/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author anizam
 */
public class Ornek1a {
    public static void main(String[] args) {
        int not=300;
        String harfNot="";
        if (not>=70 && not<=100){
            harfNot="AA";
        }
        else if (not>=45 && not< 70 ){
            harfNot="CC";
        }
        else if (not>=0 && not<45){
            harfNot="FF";
        }else{
            harfNot="Hata";
        }
        System.out.println("Harf Notu: "+harfNot);
    }
}
