/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Person;
import model.Encounter;
import model.EncounterHistory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author kanis
 */
public class Patient extends Person{
    
    private static EncounterHistory encounterData;
    private ArrayList<Encounter> enounters;
    private int count =0;
    
    public Patient(){
    }

    public Patient(String firstName, String lastName, int age, String contact, String isPatient, int house, String community, String city) {
        super(firstName, lastName, age, contact, isPatient, house, community, city);
        encounterData=new EncounterHistory();
        this.enounters = new ArrayList<Encounter>();
        enounters.clear();
        for(Encounter e: encounterData.getEncounterArrayList()){
            if(contact.equals(e.getContact())){
                enounters.add(e);
                count++;
            }
        }
    }
    
    public EncounterHistory getEncounterData(){
        return encounterData;
    }
    
    public void setEncounterData(EncounterHistory encounterData){
        this.encounterData = encounterData;
    }
    
    public ArrayList<Encounter> getEncounters(){
        return enounters;
    }
    
    public void setEncounters(ArrayList<Encounter> encounters){
        this.enounters = encounters;
    }
    
    public void deleteEncounter(Encounter e){
        enounters.remove(e);
    }
    
}
