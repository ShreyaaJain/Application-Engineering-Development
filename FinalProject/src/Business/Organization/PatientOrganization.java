/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class PatientOrganization extends Organization{
    
    private PatientDirectory patientDirectory;
    
    public PatientOrganization(){
        super(Organization.Type.Patient.getValue());
        //super.employeeDirectory = new PatientDirectory();
        patientDirectory = new PatientDirectory();
    
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
    
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
        
    }
    
}
