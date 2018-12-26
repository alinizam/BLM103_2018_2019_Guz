/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import javafx.scene.paint.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author alinizam
 */
public class GunlerTest {
    public static void main(String[] args) {
        Gunler g=Gunler.SALI;
        if (Gunler.CUMA==g) {
            System.out.println("Günlerden Cuma");
        }
        int i=JOptionPane.showConfirmDialog(null, "Kabul ediyor musunuz?");
        if (JOptionPane.YES_OPTION==i)
                 System.out.println("Evet seçildi");
        System.out.println(Color.RED);
        System.out.println(Gunler.SALI.gunNo);
    }
}
