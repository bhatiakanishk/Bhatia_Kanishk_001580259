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
public class Patient extends Person {
    public ArrayList <Encounter> Enclist = new ArrayList<Encounter>();
    @Override
	public String toString() {
        return  "Patient{"  +  "Encounter List"  +  Enclist  +  '}';
	}
}
