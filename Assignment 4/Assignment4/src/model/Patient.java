/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kanis
 */
public class Patient extends Person{
    public ArrayList <Encounter> Enclist = new ArrayList<Encounter>();

    public Patient(String firstname, String lastname, long contactno, int zipcode) {
        super(firstname, lastname, contactno, zipcode);
    
    }
    
    public Patient(){
        
    }
        
	@Override
	public String toString() {
        return  "Patient{"  +  "Encounter List"  +  Enclist  +  '}';
        }

    public ArrayList<Encounter> getEnclist() {
        return Enclist;
    }

    public void setEnclist(ArrayList<Encounter> Enclist) {
        this.Enclist = Enclist;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }
        
        
}
