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
        
        Patient p1 = new Patient("Kanishk", "Bhatia", "22", "8879962666", "1", "Longwood", "Boston");
        Patient p2 = new Patient("Raj", "Mehta", "23", "9969293888", "2", "Longwood", "Boston");
        
        patientArrayList.add(p1);
        patientArrayList.add(p2);
    }
    
    public ArrayList<Patient> getPatient(){
        return patientArrayList;
    }
}
