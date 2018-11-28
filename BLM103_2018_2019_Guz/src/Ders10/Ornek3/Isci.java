/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek3;

/**
 *
 * @author anizam
 */
public class Isci extends Personel {

    public Isci(int calismaSure) {
        super(calismaSure);
    }
    
    public int getMaas() {   
        this.maas=super.getMaas()+1000;
        return this.maas;
    }
}
