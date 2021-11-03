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
public class VitalSigns {
    
    public String temperature;
    public int bloodpressure;
    public String pulse;
    public int weight;
    public String contact;
    
    public VitalSigns(){
    }
    
    public VitalSigns(String temperature, int bloodpressure, String pulse, int weight, String contact){
        this.temperature = temperature;
        this.bloodpressure=bloodpressure;
        this.pulse=pulse;
        this.weight=weight;
        this.contact=contact;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public int getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(int bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
   
}
