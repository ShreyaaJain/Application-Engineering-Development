/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dell
 */
public class MedicationHistory {
    
    private String medicine;
    //private Medicine takenTime;
    private Date date;
    private int takenTime;
    private int prescribedTimes;
    //private Date timeStamp;

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    

    public int getPrescribedTimes() {
        return prescribedTimes;
    }

    public void setPrescribedTimes(int prescribedTimes) {
        this.prescribedTimes = prescribedTimes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTakenTime() {
        return takenTime;
    }

    public void setTakenTime(int takenTime) {
        this.takenTime = takenTime;
    }

    
    
    

    /*public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }*/
    
    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd 'at' hh:mm a");
        return ft.format(takenTime);
    } 

    
    
    
}
