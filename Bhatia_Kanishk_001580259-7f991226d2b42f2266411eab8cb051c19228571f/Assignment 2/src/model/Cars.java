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
}
