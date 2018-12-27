/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Lab.Ornek2;

/**
 *
 * @author alinizam
 */
public class TestInteger implements ITest<Integer> {

    @Override
    public boolean test(Integer i) {
        return i % 2 == 0;
    }

}
