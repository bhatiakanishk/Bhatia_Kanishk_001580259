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
    
    private String temperature;
    private String bloodpressure;
    private String pulse;
    private int weight;
    private String contact;
    
    public VitalSigns(){
    }
    
    public VitalSigns(String temperature, String bloodpressure, String pulse, int weight, String contact){
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

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
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
