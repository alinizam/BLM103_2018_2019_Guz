/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author alinizam
 */
public class Test {

    public static void main(String[] args) {
        Integer[] dizi = {4, 5, 6};
        Collection c = new ArrayList(Arrays.asList(dizi));

        int testiGecenler = testiGecenleriSay(c, new TestInteger());
        System.out.println(testiGecenler);

        ITest<Integer> test = (i -> i % 2 == 0);
        testiGecenler = testiGecenleriSay(c, test);
        System.out.println(testiGecenler);

        // kötü çözüm
        testiGecenler = testiGecenleriSay(c, ( i -> (Integer)i % 2 == 0));
        System.out.println(testiGecenler);
    }

    public static <T> int testiGecenleriSay(Collection<T> c, ITest<T> p) {
        int adet = 0;

        for (T eleman : c) {
            if (p.test(eleman)) {
                adet++;
            }
        }

        return adet;
    }

}
