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
public class PersonDirectory {
    private static ArrayList<Person> personDirectoryArrayList;
    
    public PersonDirectory(){
        this.personDirectoryArrayList = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getpersonDirectoryArrayList(){
        return personDirectoryArrayList;
    }
}
