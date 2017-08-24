/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dell
 */
public class Medicine {
    private ArrayList<Date> med;
    private ArrayList<Integer> count;
    
    public Medicine(){
        
    }

    public ArrayList<Date> getMed() {
        return med;
    }

    public void setMed(ArrayList<Date> med) {
        this.med = med;
    }

    public ArrayList<Integer> getCount() {
        return count;
    }

    public void setCount(ArrayList<Integer> count) {
        this.count = count;
    }
    
    public void add(Date date){
        for(int i=0;i<this.med.size();i++){
            Date date1 = med.get(i);
            if(date1.getDate() == date.getDate() && date1.getYear() == date.getYear()
                    && date1.getMonth() == date.getMonth()){
                this.count.set(i, this.count.get(i));
                return;
            }
        }
        med.add(date);
        count.add(1);
    }
            
}
