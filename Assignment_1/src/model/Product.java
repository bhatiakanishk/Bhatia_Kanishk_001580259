/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;

/**
 *
 * @author kanis
 */
public class Product {
    
    private String name; /*Name*/
    private String location; /*Geographic data*/
    private int dateDay; /*Day of Birth*/
    private int dateMonth; /*Month of Birth*/
    private int dateYear; /*Year of Birth*/
    private int phone; /*Telephone number*/
    private int fax; /*FAX number*/
    private String email; /*Email address*/
    private int ssn; /*Spcial Security Number*/ 
    private int med; /*Medical Record Number*/
    private int hp; /*Health plan number*/
    private int ba; /*Bank Acoount Number*/
    private int ln; /*Licence Number*/
    private int vid; /*Vehicle identifier*/
    private int did; /*Device identifier*/
    private String link; /*LinkedIn*/
    private int ip; /*IP Address*/
    private int uid; /*Unique ID*/
    /*Photos*/
    
    Scanner sc=new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDateDay() {
        return dateDay;
    }

    public void setDateDay(int dateDay) {
        if(dateDay>31)
            throw new IllegalArgumentException("Please enter valid day");
        this.dateDay = dateDay;
    }

    public int getDateMonth() {
        return dateMonth;
    }

    public void setDateMonth(int dateMonth) {
        if (dateMonth>12)
            throw new IllegalArgumentException("Please enter valid month");
        this.dateMonth = dateMonth;
    }

    public int getDateYear() {
        return dateYear;
    }

    public void setDateYear(int dateYear) {
        if (dateYear<1900){
            throw new IllegalArgumentException("Please enter valid year");
        } else if(dateYear>2021){
            throw new IllegalArgumentException("Please enter valid year.");
        }
        this.dateYear = dateYear;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        int phonecount=0;
        phone=sc.nextInt();
        while(phone!=0){
            phone=phone/10;
            phonecount++;             
        }
        if (phonecount<1900){
            throw new IllegalArgumentException("Please enter valid number");
        } else if(phonecount>2021){
            throw new IllegalArgumentException("Please enter valid number.");
        }
        this.phone = phone;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        int ssncount=0;
        ssn=sc.nextInt();
        while(phone!=0){
            phone=phone/10;
            ssncount++;             
        }
        if (ssncount<10){
            throw new IllegalArgumentException("Please enter valid ssn number");
        } else if(ssncount>10){
            throw new IllegalArgumentException("Please enter valid ssn number.");
        }
        this.ssn = ssn;
    }

    public int getMed() {
        return med;
    }

    public void setMed(int med) {
        this.med = med;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getBa() {
        return ba;
    }

    public void setBa(int ba) {
        int bacount=0;
        ba=sc.nextInt();
        while(phone!=0){
            phone=phone/10;
            bacount++;             
        }
        if (bacount<10){
            throw new IllegalArgumentException("Please enter valid bank account number");
        } else if(bacount>12){
            throw new IllegalArgumentException("Please enter valid bank account number.");
        }
        this.ba = ba;
    }

    public int getLn() {
        return ln;
    }

    public void setLn(int ln) {
        this.ln = ln;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

   
    }
