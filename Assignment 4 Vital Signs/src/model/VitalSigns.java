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
    
    private int temperature;
    private int bloodpressure;
    private int pulse;
    private int weight;
    
    public VitalSigns(){
    }
    
    public VitalSigns(int temperature, int bloodpressure, int pulse, int weight){
        this.temperature = temperature;
        this.bloodpressure=bloodpressure;
        this.pulse=pulse;
        this.weight=weight;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(int bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
   
}
