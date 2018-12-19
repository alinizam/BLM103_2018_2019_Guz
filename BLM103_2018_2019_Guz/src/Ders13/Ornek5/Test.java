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
public class Test {

    public static void main(String[] args) {
        HesapMakinesi h = new HesapMakinesi(10, 5);
        h.hesapYap();
        HesapMakinesi h1 = new HesapMakinesi(20, 5);
        h1.hesapYap();

        h1.hesapYonteminiAl(new IIslem() {
            @Override
            public int islemYap() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.                
            }

            @Override
            public int islemYap(int a, int b) {
                return (a + b);
            }
        });
        
        h1.hesapYonteminiAl(new IIslem() {
            @Override
            public int islemYap() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.                
            }

            @Override
            public int islemYap(int a, int b) {
                return (a * b);
            }
        });
        
    }
}
