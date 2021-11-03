/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import model.Person;
import model.PersonDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;


/**
 *
 * @author kanis
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientArrayList;
    private PersonDirectory personData;
    
    public PatientDirectory(){
        this.patientArrayList = new ArrayList<Patient>();
        this.personData = new PersonDirectory();
        
        Patient p1 = new Patient("A", "B", 25, "9825392454", "1", "Longwood", "Boston"); //Abnormal Age 25
        Patient p2 = new Patient("C", "D", 29, "4676306147", "1", "Longwood", "Boston");//Abnormal Age 29
        Patient p3 = new Patient("E", "F", 38, "5907806836", "2", "Longwood", "Boston");//Normal Age 38
        Patient p4 = new Patient("G", "H", 40, "1189396615", "2", "Longwood", "Boston");//Normal Age 40
        Patient p5 = new Patient("I", "J", 45, "8731701466", "2", "Longwood", "Boston");//Normal Age 45
        Patient p6 = new Patient("K", "L", 52, "1924716878", "3", "Allston", "Boston");//Normal Age 52
        Patient p7 = new Patient("M", "N", 59, "2504903702", "3", "Allston", "Boston");//Abnormal Age 59
        Patient p8 = new Patient("O", "P", 68, "8772382293", "4", "Allston", "Boston");//Abnormal Age 68
        Patient p9 = new Patient("Q", "R", 78, "5725987481", "4", "Allston", "Boston");//Abnormal Age 78
        
        patientArrayList.add(p1);
        patientArrayList.add(p2);
        patientArrayList.add(p3);
        patientArrayList.add(p4);
        patientArrayList.add(p5);
        patientArrayList.add(p6);
        patientArrayList.add(p7);
        patientArrayList.add(p8);
        patientArrayList.add(p9);
    }
    
    public ArrayList<Patient> getPatient(){
        return patientArrayList;
    }
}
