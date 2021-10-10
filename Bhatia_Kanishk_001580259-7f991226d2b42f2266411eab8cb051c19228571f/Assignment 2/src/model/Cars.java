/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kanishk
 */
public class Cars {
    
    public ArrayList<Cars> cars;
    
    public String manufacturer; //Car Company
    public String model; //Car Model
    public String year; //Year of manufacturing
    public String seats; //number of seats
    public String srno; //Serial Number
    public String city; //City 
    public String certificate; //Valid Maintenance Certificate
    public String available; //Availability
  

    public Cars(String manufacturer, String model, String year, String seats, String srno, String city, String certificate, String available) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.seats = seats;
        this.srno = srno;
        this.city = city;
        this.certificate = certificate;
        this.available = available;
    }
    

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Cars> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Cars> cars) {
        this.cars = cars;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getSrno() {
        return srno;
    }

    public void setSrno(String srno) {
        this.srno = srno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
