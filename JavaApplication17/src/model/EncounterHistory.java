/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author kanis
 */
public class EncounterHistory {
    private static ArrayList<Encounter> encounterArrayList;
    
    public EncounterHistory() {
        this.encounterArrayList = new ArrayList<Encounter>();
        Encounter e1 = new Encounter("Dr. A", "Headache", 99.1, 100.0, 94, "21/07/98");
        Encounter e2 = new Encounter("Dr. B", "Headache", 95.1, 109.0, 91, "21/07/55");
        
        encounterArrayList.add(e1);
        encounterArrayList.add(e2);
    }
    
    
    public ArrayList<Encounter> getEncounterArrayList(){
    return encounterArrayList;
    }
}
