/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workqueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Admin("Admin Organization"), 
        CareTaker("Care Taker Organization"), Doctor("Doctor Organization"),
        Receptionist("Receptionist Organization"), Supplier("Supplier Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue(){
            return value;
        }
        
    }
    
    public Organization(String name) {
        this.name = name;
        workqueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        counter++;
        
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    @Override
    public String toString() {
        return name;
    } 
    
}
