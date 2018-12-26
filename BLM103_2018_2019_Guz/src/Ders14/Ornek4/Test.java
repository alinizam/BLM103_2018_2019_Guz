/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek4;

import java.util.function.Function;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Function<Integer,Double> kareAl=Matematik::kareAl;
        System.out.println(kareAl.apply(10));
    }
}
