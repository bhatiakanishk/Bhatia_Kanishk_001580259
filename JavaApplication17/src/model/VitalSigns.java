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
    
    private double temperature;
    private double bloodpressure;
    private int pulse;
    private String date;
    
    public VitalSigns(){
    }
    
    public VitalSigns(double temperature, double bloodpressure, int pulse, String date){
        this.temperature = temperature;
        this.bloodpressure=bloodpressure;
        this.pulse=pulse;
        this.date=date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(double bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}