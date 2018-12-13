/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ekran {

    ArrayList<IHareket> bilesenler = new ArrayList();

    void bilesenEkle(IHareket bilesen) {
        bilesenler.add(bilesen);
    }

    int getToplamAlan() {
        int toplamAlan = 0;

        for (IHareket b : bilesenler) {
            toplamAlan += b.getAlan();
        }

        return toplamAlan;
    }

    ArrayList kesisenleriBul() {
        ArrayList<IHareket> kesisenler = new ArrayList<>();

        for (int i = 0; i < bilesenler.size(); i++) {
            IHareket b1 = bilesenler.get(i);
            
            for (int j = i + 1; j < bilesenler.size(); j++) {
                IHareket b2 = bilesenler.get(j);
                
                if (b1.getX1() < b2.getX2()
                        && b1.getX2() > b2.getX1()
                        && b1.getY1() < b2.getY2()
                        && b1.getY2() > b2.getY1()) {

                    // b1.kesisenler.add(b2);
                    kesisenler.add(b1);
                    break;
                }
            }

        }

        /*for (IHareket b1 : bilesenler) {
            for (IHareket b2 : bilesenler) {
                if (!b2.equals(b1)) {
                    if (b1.getX1() < b2.getX2()
                            && b1.getX2() > b2.getX1()
                            && b1.getY1() < b2.getY2()
                            && b1.getY2() > b2.getY1()) {

                        // b1.kesisenler.add(b2);
                        kesisenler.add(b1);
                        break;
                    }
                }
            }
        }
       */
        return kesisenler;
    }
    
    void setPencereUzeriButonAlan(){
        for (IHareket bilesen : bilesenler) {
            if (bilesen instanceof Pencere){
                int toplam=0;
                for (IHareket p: ((Pencere)bilesen).bilesenler) {
                    toplam+=p.getAlan();
                }
                ((Pencere)bilesen).toplamIcerilenBilesenAlan=toplam;
            }
        }
    }
    
     Pencere enCokButonuOlanPencereyiBul(){
        int enCokButon=0;
        Pencere bulunanPencere=null;
        for (IHareket bilesen : bilesenler) {
            if (bilesen instanceof Pencere){
                int toplam=0;
                 
                Pencere pencere= (Pencere)bilesen;
                if (enCokButon<pencere.bilesenler.size()){
                     enCokButon=pencere.bilesenler.size();
                     bulunanPencere=pencere;
                }
                        
            }
        }
        return bulunanPencere;
    }
}
