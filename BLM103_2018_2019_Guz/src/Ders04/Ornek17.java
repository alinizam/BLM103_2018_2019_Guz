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
public class Ornek17 {
    public static void main(String[] args) {
        //3 e bölünen say?lar hariç say?lar? ekrana yazd?r?n?z.
        for (int i = 0; i < 10; i++) {
            /*if (i%3!=0){
                System.out.println(i);
            }*/
            if (i%3==0){
               continue;
            }
            System.out.println(i);
            
        }
    }
}
