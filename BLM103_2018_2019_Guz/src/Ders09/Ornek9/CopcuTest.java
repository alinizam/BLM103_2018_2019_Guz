/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class CopcuTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Personel p=new Personel();
        FileWriter f=new FileWriter("c:\\dosyalar\\Merhaba.txt");
        f.write(65);
        f.close();
    }
    
    
}
