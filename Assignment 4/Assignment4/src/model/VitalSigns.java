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
public class VitalSigns {
    
    public ArrayList<VitalSigns> vitalsigns;
    
    public String temperature;
    public String bloodpressure;
    public String pulse;
    public String age;
    
    public VitalSigns(String temperature, String bloodpressure, String pulse, String age){
        this.temperature = temperature;
        this.bloodpressure = bloodpressure;
        this.pulse = pulse;
        this.age = age;
    }

    public ArrayList<VitalSigns> getVitalsigns() {
        return vitalsigns;
    }

    public void setVitalsigns(ArrayList<VitalSigns> vitalsigns) {
        this.vitalsigns = vitalsigns;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
