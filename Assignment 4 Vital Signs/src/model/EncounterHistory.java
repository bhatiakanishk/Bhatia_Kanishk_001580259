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
    
    public EncounterHistory(){
        this.encounterArrayList = new ArrayList<Encounter>();
        Encounter en1 = new Encounter("Dr.A", "Headache", "20/10/2021", 100,100,95,85);
        Encounter en2 = new Encounter("Dr.B", "Fever", "25/10/2021", 90,90,90,89);
        
        encounterArrayList.add(en1);
        encounterArrayList.add(en2);
    }
    
    
    public ArrayList<Encounter> getEncounterArrayList(){
        return encounterArrayList;
    }
}
