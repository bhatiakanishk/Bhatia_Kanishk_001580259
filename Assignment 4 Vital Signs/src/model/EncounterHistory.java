/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
package Encounter;
import java.util.ArrayList;
/**
 *
 * @author kanis
 */
public class EncounterHistory {
    private static ArrayList<Encounter> encounterArrayList;
    
    public EncounterHistory(){
        this.encounterArrayList = new ArrayList<Encounter>();
        Encounter en1 = new Encounter("Dr.A", "Headache", "20/10/2021", "100","100","95",85, "8879962666");
        Encounter en2 = new Encounter("Dr.B", "Fever", "25/10/2021", "90","90","90",89, "9969293888");
        Encounter en3 = new Encounter("Dr.B", "Fever", "25/10/2021", "90","90","90",89, "9969293888");
        Encounter en4 = new Encounter("Dr.B", "Fever", "25/10/2021", "90","90","90",89, "9969293888");
        Encounter en5 = new Encounter("Dr.B", "Fever", "25/10/2021", "90","90","90",89, "9969293888");
        Encounter en6 = new Encounter("Dr.B", "Fever", "25/10/2021", "90","90","90",89, "9969293888");
        Encounter en7 = new Encounter("Dr.B", "Fever", "25/10/2021", "90","90","90",89, "9969293888");
        Encounter en8 = new Encounter("Dr.B", "Fever", "25/10/2021", "90","90","90",89, "9969293888");
        Encounter en9 = new Encounter("Dr.B", "Fever", "25/10/2021", "90","90","90",89, "9969293888");
        
        encounterArrayList.add(en1);
        encounterArrayList.add(en2);
    }

    public ArrayList<Encounter> getEncounterArrayList(){
        return encounterArrayList;
    }
}
