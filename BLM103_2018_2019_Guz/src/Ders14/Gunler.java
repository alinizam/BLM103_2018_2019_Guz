/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

/**
 *
 * @author alinizam
 */
public enum Gunler {
    PAZAR,PAZARTESİ,SALI,ÇARŞAMBA,PERŞEMBE,CUMA,CUMARTESİ;
    int gunNo;
    static {
        SALI.gunNo=2;
    }
}
