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
public class VitalSignHistory {
    
    
    private ArrayList<VitalSign> vitalSignList;
    
    public VitalSignHistory(){
        this.vitalSignList = new ArrayList<>();
    }
    
    public VitalSign addVitalSign(){
         VitalSign vitalSign = new VitalSign();
        vitalSignList.add(vitalSign);
        return vitalSign;
    }
    
    public Patient addPatient(){
        Patient patient = new Patient();
        return patient;
    }
    
    public void deleteVitalSign (VitalSign vitalSign){
        vitalSignList.remove(vitalSign);
    }
    
    public void setVitalSignList (ArrayList<VitalSign> vitalSignList){
        this.vitalSignList = vitalSignList; 
    }
    
    public List<VitalSign> getVitalSignList(){
        return vitalSignList;
    }
    
}
