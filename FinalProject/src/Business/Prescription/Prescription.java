/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import java.util.Date;

/**
 *
 * @author dell
 */
public class Prescription {
    
    private String name;
    private int dosage;
    private int time;
    
    
    public Prescription(String name, int dosage, int time){
        this.name = name;
        this.dosage = dosage;
        this.time = time;
        
    }

    public String getName() {
        return name;
    }

    public int getDosage() {
        return dosage;
    }

    public int getTime() {
        return time;
    }
    
    public String toString(){
        return name;
    }
    
    
    
}
