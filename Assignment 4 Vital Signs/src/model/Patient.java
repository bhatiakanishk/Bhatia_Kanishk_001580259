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
    private String firstName;
    private String lastName;
    private int age;
    private String contact;
    private String house;
    private String community;
    private String city;
    
    private static EncounterHistory encounterData;
    private ArrayList<Encounter> enounters;
    private int count =0;
    
    public Patient(){
    }

    public Patient(String firstName, String lastName, int age, String contact, String house, String community, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.contact = contact;
        this.house = house;
        this.community = community;
        this.city = city;
        //super(firstName, lastName, age, contact, house, community, city);
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
    
    public int getCount(){
        return count;
    }
    
    public void setCount(int count){
        this.count = count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getContact() {
        return contact;
    }

    public String getHouse() {
        return house;
    }

    public String getCommunity() {
        return community;
    }

    public String getCity() {
        return city;
    }

    public ArrayList<Encounter> getEnounters() {
        return enounters;
    }
    
    
}
