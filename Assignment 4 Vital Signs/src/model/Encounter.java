/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.VitalSigns;
/**
 *
 * @author kanis
 */
public class Encounter extends VitalSigns{
    public String encounterDoc;
    public String encounterIssue;
    public String encounterDate;
    public String Temperature; 
    public String Bloodpressure;
    public String Pulse;
    public int Weight;
    public String Contact;
   
    public Encounter(){
    }

    public Encounter(String encounterDoc, String encounterIssue, String encounterDate, String Temperature, String Bloodpressure,String Pulse, int Weight,String Contact) {
        super();
        this.Temperature = Temperature;
        this.Bloodpressure = Bloodpressure;
        this.Pulse = Pulse;
        this.Weight = Weight;
        this.Contact = Contact;
        this.encounterDoc = encounterDoc;
        this.encounterIssue = encounterIssue;
        this.encounterDate = encounterDate;
    }

    public String getEncounterDoc() {
        return encounterDoc;
    }

    public void setEncounterDoc(String encounterDoc) {
        this.encounterDoc = encounterDoc;
    }

    public String getEncounterIssue() {
        return encounterIssue;
    }

    public void setEncounterIssue(String encounterIssue) {
        this.encounterIssue = encounterIssue;
    }

    public String getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getTemperature() {
        return Temperature;
    }

    public String getBloodpressure() {
        return Bloodpressure;
    }

    public String getPulse() {
        return Pulse;
    }

    public int getWeight() {
        return Weight;
    }

    public String getContact() {
        return Contact;
    }

    
    @Override
    public String toString(){
        return encounterDate;
    }
}
