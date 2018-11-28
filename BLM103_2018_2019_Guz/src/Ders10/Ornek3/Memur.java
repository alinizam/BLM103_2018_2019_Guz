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
public class Memur extends Personel {
    Memur(){
        super(0);
    }
    Memur(int calismaSure){
        super(0);
    }
    public int getMaas() {
        
        this.maas=super.getMaas()+500;
        return this.maas;
    }
    
}
