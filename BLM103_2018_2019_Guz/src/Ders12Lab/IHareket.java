/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

/**
 *
 * @author anizam
 */
public interface IHareket {
    void hareketEt(int mesafe);
    void setXY (int x1,int x2,int y1, int y2);
    int getAlan();
    int getX1(); 
    int getX2(); 
    int getY1();
    int getY2();
    void konumuYazdir();
}
