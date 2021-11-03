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
        
        Patient p1 = new Patient("A", "B", 22, "8879962666", "1", "Longwood", "Boston");
        Patient p2 = new Patient("C", "D", 23, "9969293888", "1", "Longwood", "Boston");
        Patient p3 = new Patient("E", "F", 23, "9969293888", "2", "Longwood", "Boston");
        Patient p4 = new Patient("G", "H", 23, "9969293888", "2", "Longwood", "Boston");
        Patient p5 = new Patient("I", "J", 23, "9969293888", "2", "Longwood", "Boston");
        Patient p6 = new Patient("K", "L", 23, "9969293888", "3", "Longwood", "Boston");
        Patient p7 = new Patient("M", "N", 23, "9969293888", "3", "Longwood", "Boston");
        Patient p8 = new Patient("O", "P", 23, "9969293888", "4", "Longwood", "Boston");
        Patient p9 = new Patient("Q", "R", 23, "9969293888", "4", "Longwood", "Boston");
        
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
