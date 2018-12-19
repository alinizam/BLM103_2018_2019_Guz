/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek5;

/**
 *
 * @author alinizam
 */
public class HesapMakinesi {
    int a;
    int b;

    public HesapMakinesi(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    void hesapYap(){
        
       /* class Topla implements IIslem{
            @Override
            public int islemYap(int a, int b) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        Topla t=new Topla();
        t.islemYap(a, b);*/
                
        IIslem topla=new IIslem() {
            public int islemYap() {
               return a+b; 
            }

            @Override
            public int islemYap(int a, int b) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        IIslem carp=new IIslem() {
            public int islemYap() {
               return a*b; 
            }

            @Override
            public int islemYap(int a, int b) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        System.out.println(carp.islemYap());
        
    }
    
    void hesapYonteminiAl(IIslem islem){
      System.out.println(islem.islemYap(a,b));
    }
          
}
