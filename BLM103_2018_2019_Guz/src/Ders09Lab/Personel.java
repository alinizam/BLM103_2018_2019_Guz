/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Personel {

    String adi, soyadi;
    Salary salary;
    Company company;
    int girisYili;
    static ArrayList<Personel> personeller = new ArrayList();

    public Personel() {
        personeller.add(this);
    }

    void setMaas(Salary salary) {
        this.salary = salary;
    }

    int toplamMaasiBul() {
        int toplam = 0;
        for (Personel p : personeller) {
            toplam += p.salary.net;
        }
        return toplam;
    }

    int increaseSalary(int artis) {
        int toplam = 0;
        for (Personel p : personeller) {
            p.salary.net += artis;
            toplam += artis;
        }
        return toplam;
        //return artis*personeller.size();
    }

    int getAdresOdeme(String adres) {
        int toplam = 0;
        for (Personel p : personeller) {
            if (p.company.address.equals(adres)) {
                toplam += p.salary.net;
            }
        }
        return toplam;

    }

    int[] getYilMaas() {

        int[] yilMaas = new int[10];
        int yil = 2010;
        for (int i = 0; i < 10; i++) {
            int toplam = 0;
            for (Personel p : personeller) {
                if (p.girisYili == yil) {
                    toplam += p.salary.net;
                }
            }
            yil++;
            yilMaas[i] = toplam;
        }

        return yilMaas;

    }

    ArrayList<Company> getCalisanSayi() {
        ArrayList<Company> sirketler = new ArrayList();
        for (Personel p : personeller) {
            /*if (!sirketler.contains(p.company)) {
                p.company.calisanSayi=1;
                sirketler.add(p.company);
            }else{
                p.company.calisanSayi++;
            }*/
            if (!sirketler.contains(p.company)) {
                sirketler.add(p.company);
            } 
            p.company.calisanSayi++;
        }
        return sirketler;
    }
}
