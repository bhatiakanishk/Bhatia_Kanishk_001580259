/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kanis
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String contact;
    private String house;
    private String community;
    private String city;
    
    public Person(){
        
    }
    
    public Person(String firstName, String lastName, int age, String contact, String house, String community, String city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.contact = contact;
        this.house = house;
        this.community = community;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
    
}
