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
    private String encounterDate;
    
    public Encounter(){
    }

    public Encounter(String encounterDoc, String encounterIssue, String encounterDate, int temperature, int bloodpressure, int pulse, int weight) {
        super(temperature, bloodpressure, pulse, weight);
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
    
    @Override
    public String toString(){
        return encounterDate;
    }
}
