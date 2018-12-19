/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek4;

/**
 *
 * @author alinizam
 */
public class Ornek4 {
    public void sayGoodbyeInEnglish() {
        class EnglishGoodbye {
            public void sayGoodbye() {
                System.out.println("Bye bye");
            }
        }
        new EnglishGoodbye().sayGoodbye();
    }

}
