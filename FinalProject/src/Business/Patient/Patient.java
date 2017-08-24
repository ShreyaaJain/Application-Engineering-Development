/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Prescription.MedicationHistory;
import Business.Prescription.Prescription;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class Patient{
    
    private String name;
    private int age;
    private int patientID;
    private String address;
    private String sex;
    private static int count =1;
    private UserAccount doctor;
    private UserAccount careTaker;
    private VitalSignHistory vitalSignHistory;
    //private HealthRecord healthRecord;
    private List<Prescription> prescriptionList;
    private List<MedicationHistory> medicationHistoryList;

    
    public Patient(){
        
        patientID = count++; 
        vitalSignHistory = new VitalSignHistory();
        prescriptionList = new ArrayList<>();
        medicationHistoryList = new ArrayList<>();
        //healthRecord = new HealthRecord();
    }
    
    public void addPrescription(Prescription prescription){
        prescriptionList.add(prescription);
        
    }
    
    public void addMedicationHistory(MedicationHistory medicationHistory){
        medicationHistoryList.add(medicationHistory);
    }

    public List<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public List<MedicationHistory> getMedicationHistoryList() {
        return medicationHistoryList;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public UserAccount getCareTaker() {
        return careTaker;
    }

    public void setCareTaker(UserAccount careTaker) {
        this.careTaker = careTaker;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    /*
//method to calculate Current age of a Person using his DOB
    public int getAge() {
        int age;

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Calendar beginCalendar = Calendar.getInstance();
        beginCalendar.setTime(DOB);

        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(new Date());

        int minusDays = 0;       // for calculating no. of days
        while (true) {
            minusDays++;

            // Day increasing by 1
            beginCalendar.add(Calendar.DAY_OF_MONTH, 1);

            if (dateFormat.format(beginCalendar.getTime()).
                    equals(dateFormat.format(endCalendar.getTime()))) {
                break;
            }
        }
        //add code for calculation of age
        age = (minusDays + 1) / 365;
    }
        return age;*/

    @Override
    public String toString() {
        return name;
    }
    

   
      
}
