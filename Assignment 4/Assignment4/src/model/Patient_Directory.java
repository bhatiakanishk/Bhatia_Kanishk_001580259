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
public class Patient_Directory extends Person_Directory {
   public List <Patient> patient = new ArrayList<>();

	 public void addPatient(Patient p) {
	        this.patient.add(p);
	    }
	 
	 public void addPerson(Patient p) {
		 this.person.add(p);
	 }
}
