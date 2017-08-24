/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author dell
 */
public class DoctorWorkRequest extends WorkRequest {
    
    private UserAccount careTaker;


    public UserAccount getCareTaker() {
        return careTaker;
    }

    public void setCareTaker(UserAccount careTaker) {
        this.careTaker = careTaker;
    }
   
 
}
