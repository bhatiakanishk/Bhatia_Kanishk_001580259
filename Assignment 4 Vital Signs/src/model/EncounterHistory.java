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
        Encounter en1 = new Encounter("Dr.A", "Headache", "20/10/2021", "89",126,"95",85, "9825392454"); //Abnormal
        Encounter en2 = new Encounter("Dr.B", "Fever", "25/10/2021", "90",129,"90",89, "4676306147");//Abnormal
        Encounter en3 = new Encounter("Dr.C", "Back Pain", "19/09/2021", "94",118,"90",70, "5907806836"); //Normal
        Encounter en4 = new Encounter("Dr.D", "Ankle Injury", "01/07/2021", "92",117,"91",67, "1189396615 ");//Normal
        Encounter en5 = new Encounter("Dr.E", "Fever", "18/01/2021", "92",112,"93",55, "8731701466 ");//Normal
        Encounter en6 = new Encounter("Dr.F", "Stomachache", "16/08/2021", "96",109,"92",72, "1924716878 ");//Normal
        Encounter en7 = new Encounter("Dr.G", "Headache", "29/06/2021", "98",69,"90",66, "2504903702 ");//Abnormal
        Encounter en8 = new Encounter("Dr.H", "COVID", "22/02/2020", "101",125,"96",59, "8772382293 ");//Abnormal
        Encounter en9 = new Encounter("Dr.I", "COVID", "03/03/2020", "102",127,"97",62, "5725987481");//Abnormal
        
        encounterArrayList.add(en1);
        encounterArrayList.add(en2);
        encounterArrayList.add(en3);
        encounterArrayList.add(en4);
        encounterArrayList.add(en5);
        encounterArrayList.add(en6);
        encounterArrayList.add(en7);
        encounterArrayList.add(en8);
        encounterArrayList.add(en9);
    }

    public ArrayList<Encounter> getEncounterArrayList(){
        return encounterArrayList;
    }
}
