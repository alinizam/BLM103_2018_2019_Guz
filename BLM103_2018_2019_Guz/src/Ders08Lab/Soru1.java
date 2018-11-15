/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab;

/**
 *
 * @author anizam
 */
public class Soru1 {
    
    public static void main(String[] args) {
        int arananSayi=5;
        int [] arananDizi={1,5,6,3,5,9};
              
        int kacinciEleman=-1;
        boolean var=false;
        for (int i = 0; i < arananDizi.length; i++) {
            if (arananSayi==arananDizi[i]) {
                var=true;
                kacinciEleman=i;
                break;
            }
            
        }
        System.out.println(var);
        System.out.println("Bulundu?u eleman "+kacinciEleman);
        
      System.out.println(varMi(arananDizi,arananSayi));
        
         int[] indisDizi=indisleriBul(arananDizi,arananSayi);
         for (int j : indisDizi) {
             System.out.print(j+",");            
        }
        
    }
    
    static boolean varMi(int[] dizi,int aranan){
      boolean var=false;
        for (int e : dizi) {
            if (e==aranan) {
                var=true;
                break;
            }
        }
      return var;
    }
    
    static int[] indisleriBul(int[] dizi,int aranan){
        
        int[] indisDizi=new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            
            if(dizi[i]==aranan)
                indisDizi[i]=1;
        }
        
        return indisDizi;
    } 
    
    
}
