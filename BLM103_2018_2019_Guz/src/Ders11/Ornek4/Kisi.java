/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek4;

/**
 *
 * @author anizam
 */
class Kisi {

    public void BenKimim() {
        System.out.println("Ben herhangi bir kisiyim.");
    }

}

class Memur extends Kisi{

    public void BenKimim() {
        System.out.println("Ben bir memurum.");
    }

}


class Isci extends Kisi{

    public void BenKimim() {
        System.out.println("Ben bir i?çiyim.");
    }

}