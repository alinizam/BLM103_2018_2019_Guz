/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek1;

/**
 *
 * @author anizam
 */
public  class Araba {
   public int fiyat;
   private Personel p;
   private String model;
   protected String modifiye;
   void getModel(){
       Araba a=new Araba();
       a.model="";
       System.out.println(model);
       System.out.println(modifiye);
   }


    public void setP(Personel p) {
        //Kontrol veya ilave i?lemler.
        this.p = p;
    }
   
}
