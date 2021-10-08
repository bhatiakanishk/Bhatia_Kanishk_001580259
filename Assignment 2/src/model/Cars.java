/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kanishk
 */
public class Cars {
    
    public String manufacturer; //Car Company
    public String model; //Car Model
    public int year; //Year of manufacturing
    public int seats; //number of seats
    public String srno; //Serial Number
    public String city; //City 
    public String certificate; //Valid Maintenance Certificate
    public String available; //Availability

    //ma -> manufacturer
    //md -> model
    //yr -> year
    //se -> seats
    //sn -> Serial Number
    //ci -> City
    //cf -> Certificate
    //av -> Availability
    public Cars(String ma, String md, int yr, int se, String sn, String ci, String cf, String av) {
        
        this.manufacturer = ma;
        this.model = md;
        this.year = yr;
        this.seats = se;
        this.srno = sn;
        this.city = ci;
        this.certificate = cf;
        this.available = av;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
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

    public Cars() {
    }
      
}
