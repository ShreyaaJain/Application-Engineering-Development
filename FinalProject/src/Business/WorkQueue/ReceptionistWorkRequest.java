/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.UserAccount.UserAccount;

/**
 *
 * @author dell
 */
public class ReceptionistWorkRequest extends WorkRequest {
    
    private String prescription;
    private String result;
   // private Patient patient;
    //private UserAccount patient;

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    
    
    

    /*@Override
    public String toString() {
        return prescription;
    }*/

    @Override
    public String toString() {
        return result;
    }
    
    
    
    
}
