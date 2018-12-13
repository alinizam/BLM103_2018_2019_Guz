/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Buton implements IHareket {

    int x1, x2, y1, y2;
    ArrayList<IHareket> kesisenler = new ArrayList<>();
    
    @Override
    public void hareketEt(int mesafe) {
        this.x1 += mesafe + 5;
        this.x2 += mesafe + 5;
        this.y1 += mesafe + 5;
        this.y2 += mesafe + 5;
    }

    @Override
    public void setXY(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public int getAlan() {
        return (x2 - x1) * (y2 - y1);
    }

    @Override
    public int getX1() {
        return x1;
    }

    @Override
    public int getX2() {
        return x2;
    }

    @Override
    public int getY1() {
        return y1;
    }

    @Override
    public int getY2() {
        return y2;
    }

    @Override
    public void konumuYazdir() {
        System.out.println(x1 + "-" + x2 + ";" + y1 + "-" + y2);
    }
}
