/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author anizam
 */
public class Ornek5 {

    public static void main(String[] args) {
        int maas = 3000, yas = 35, calisma_suresi = 5;
        String unvan = "Memur";
        /*if(maas>=3000 && yas>30 && 
         calisma_suresi>2 && unvan=="Memur"){
         maas*=1.1;
         }*/

        boolean maasArtisinaUygun;
        maasArtisinaUygun = (maas >= 3000 && yas > 30
                && calisma_suresi > 2 && unvan == "Memur");
        if (maasArtisinaUygun) {
            maas *= 1.1;
        }
        System.out.println(maas);
    }
}
