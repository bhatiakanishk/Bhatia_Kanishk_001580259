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
    private String encounterDoc;
    private String encounterIssue;
    
    public Encounter(){
    }

    public Encounter(String encounterDoc, String encounterIssue, double temperature, double bloodpressure, int pulse, String date) {
        super(temperature, bloodpressure, pulse, date);
        this.encounterDoc = encounterDoc;
        this.encounterIssue = encounterIssue;
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
    
    
    
}
