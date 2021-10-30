/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Scanner;
/**
 *
 * @author kanis
 */
public class Encounter extends Patient {
    VitalSigns evs;
	
	public Encounter(VitalSigns vs) {
		this.evs=vs;
	}

	/*@Override
	public String toString() {
		return "Encounter [evs=" + evs + "]";
	}*/
}
