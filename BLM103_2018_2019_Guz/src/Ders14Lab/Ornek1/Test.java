/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek1;

/**
 *
 * @author alinizam
 */
public class Test {
    /*
    Bir dizinin iki elamanının yerini değiştiren generic bir metot tasarlayınız.
    public static <T> void swap(T[] a, int i, int j) 
 
    */
    public static void main(String[] args) {
        Character[] dizi = {65, 66, 67};
        swap(dizi, 0, 2);

        for (Character s : dizi) {
            System.out.println(s);
        }
    }

    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
