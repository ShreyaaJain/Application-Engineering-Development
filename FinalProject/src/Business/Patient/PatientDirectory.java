/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class PatientDirectory {
    
    private List<Patient> patientList;
    
    public PatientDirectory(){
        patientList = new ArrayList<>();
    }

    public List<Patient> getPatientList() {
        return patientList;
    }
    
    public void addPatient(Patient p){
        //Patient p = new Patient();
        patientList.add(p);
        //return p;
    }
    
    
    
}
