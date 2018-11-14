/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

/**
 *
 * @author anizam
 */
public class Ornek11 {
    public static void main(String[] args) {
        int matris[][]=new int[4][3];
        matris[0][0]=5;
        matris[0][1]=3;
        matris[1][1]=7;
        matris[2][0]=1;
        matris[3][2]=5;
        
        /*5 3 0
        0 7 0
        1 0 0
        0 0 5*/
        
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print("("+i+","+j+") "+matris[i][j]+" ");
               //System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
