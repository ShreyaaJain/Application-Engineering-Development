/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author dell
 */
public abstract class Role {

    public enum RoleType {

        Admin("Admin"),
        Patient("Patient"),
        Doctor("Doctor"),
        CareTaker("CareTaker"),
        Family("Family"),
        Receptionist("Receptionist");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
        
    }
    
    RoleType roleType;

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    
    
   
        public abstract JPanel createWorkArea(JPanel userProcessContainer,
                UserAccount account,
                Organization organization,
                Enterprise enterprise,
                Network network,
                EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
 
        

}
