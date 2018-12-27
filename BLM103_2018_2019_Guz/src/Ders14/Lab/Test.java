/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Lab;

/**
 *
 * @author alinizam
 */
public class Test {

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
