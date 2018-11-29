/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab;

/**
 *
 * @author anizam
 */
public class Idari extends Personel{
    
    
    void setMaas(Salary salary) {
        salary.net+=(int)(0.1)*salary.net;
        this.salary=salary;
    }
    
}
