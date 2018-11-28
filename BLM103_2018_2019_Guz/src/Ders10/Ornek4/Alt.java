/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek4;

/**
 *
 * @author anizam
 */
public class Alt extends Ust {
     Alt(){
        System.out.println("Alt sinif yapicisi calisti");
        System.out.println("yapicinin icinde calisan kod :" + super.ilkDeger);
        ilkDeger=200;
        System.out.println("yapicinin icinde calisan kod :" + super.ilkDeger);
    }
}
