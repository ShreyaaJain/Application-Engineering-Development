# Application-Engineering-Development - Medication Monitoring

## PROBLEM STATEMENT

- People (generally elderly people) forget to take their medications as prescribed. - Poor medication therapy result in complications, increased healthcare costs, and even death. - A device that could update the doctor about the missed medication can help the doctors know when to rev up a patient’s medication adherence.

## PROPOSED SOLUTION

- Patients will be given pills which have been modified to contain edible 0.05mm sensor (sand-particle sized sensor consists of a minute silicon chip containing trace amounts of magnesium and copper).- After the chip has been swallowed, chip is activated by the stomach fluid, sending a signal to a patch in the arm.- Patch contains receiver which decodes that the drug has been taken.- Receiver transmits information to mobile telling the caretaker member that the drug has been taken by the patient and at what time. And it also calculates the patients vitals sign every time the patient takes the drug. 

## OBJECT MODEL

![alt tag](https://github.com/ShreyaaJain/Application-Engineering-Development/blob/master/Images/ObjectModel.png)

## Key Roles

Patients – A person being treated with sensor pills to help take proper medication.
Receiver – Decode the message and pass to the doctor.
Doctors/Care Takers – A patient will be assigned to a particular doctor/ care taker.
Family – Patient will belong to the family.
Society – Each patient belongs to a particular society. 

## Features

1. Email notification is sent to the patients whenever they miss to take their medicine, like a quick reminder. 

![alt tag](https://github.com/ShreyaaJain/Application-Engineering-Development/blob/master/Images/Feature1.png)

2. Overview at the network level to check which medicine is used with what frequency and thus can help a pharmacy produce the medication accordingly

![alt tag](https://github.com/ShreyaaJain/Application-Engineering-Development/blob/master/Images/Feature2.png)

3. Comparison of Vital Signs for both the caretaker and patient to have a better look at the patients condition.

![alt tag](https://github.com/ShreyaaJain/Application-Engineering-Development/blob/master/Images/Feature3.png)

