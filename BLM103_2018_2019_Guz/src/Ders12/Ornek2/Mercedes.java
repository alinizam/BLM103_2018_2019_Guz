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
        this.modifiye="";//�rnek �zerinden protected g�r�nt�
        super.modifiye="";//�st s?n?f �zelli?ine eri?im
        Araba a=new Araba();
        //a.modifiye=""; Hatal? Kod Kal?t?mdan ba??ms?z g�r�nm�yor.
    }
}
