/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek2;

import Ders12.Ornek1.Araba;

/**
 *
 * @author anizam
 */
public class Mercedes extends Araba{
    void getModifiye(){
        this.modifiye="";//örnek üzerinden protected görüntü
        super.modifiye="";//üst s?n?f özelli?ine eri?im
        Araba a=new Araba();
        //a.modifiye=""; Hatal? Kod Kal?t?mdan ba??ms?z görünmüyor.
    }
}
