/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        class Islem implements IIslem{

            @Override
            public int metot(int a, int b) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        }
        IIslem islem1=new Islem();
        IIslem islem2=new Islem();
        IIslem islem3=new Islem();
        
        IIslem carpma=new IIslem(){
            @Override
            public int metot(int a, int b) {
                return a*b;
            }
        }; 
        
        IIslem toplama=(a,b)->a+b;  
        IIslem cikarma=(int a,int b)->{return a-b;};  
        
        IAraba modelAl=((Araba a)->{return a.model;});
        IAraba modelAlSade=(a->a.model);
        
        calistir(10, 5, cikarma);
        calistir(10,5,carpma);
        calistir(10,6,toplama);
        
        
        IHareket hareketEt=()->System.out.println("Hareket başladı");

    }
    static void calistir(int a,int b,IIslem islem){
        System.out.println(islem.metot(a, b));
    }
}
