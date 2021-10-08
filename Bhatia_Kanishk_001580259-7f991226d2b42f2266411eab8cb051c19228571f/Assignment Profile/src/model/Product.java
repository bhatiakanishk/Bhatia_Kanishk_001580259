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
    Scanner sc=new Scanner(System.in);
    
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
    private String licence; /*Licence Plate*/
    private int did; /*Device identifier*/
    private String link; /*LinkedIn*/
    private int ip1; /*IP Address*/
    private int ip2; /*IP Address*/
    private int ip3; /*IP Address*/
    private int ip4; /*IP Address*/
    private int uid; /*Unique ID*/
    private String SelectedImagePath;

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

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
        if (dateDay>31) {
            throw new IllegalArgumentException("Day cannot be above 31");
        }
        else if (dateDay<0) {
            throw new IllegalArgumentException("Day cannot be below 0");            
        }
        this.dateDay = dateDay;
    }

    public int getDateMonth() {
        return dateMonth;
    }

    public void setDateMonth(int dateMonth) {
        if (dateMonth>12) {
            throw new IllegalArgumentException("Month cannot be above 31");
        }
        else if (dateMonth<0) {
            throw new IllegalArgumentException("Month cannot be below 0");            
        }
        this.dateMonth = dateMonth;
    }

    public int getDateYear() {
        return dateYear;
    }

    public void setDateYear(int dateYear) {
        if (dateYear>2021) {
            throw new IllegalArgumentException("Year cannot be above 2021");
        }
        else if (dateYear<0) {
            throw new IllegalArgumentException("Year cannot be below 0");            
        }
        this.dateYear = dateYear;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        if(phone<1000000000){
            throw new IllegalArgumentException("Invalid Number");
        }
        /*int count=0;
        while(phone!=0){
            phone=phone/10;
            count++;
        }
        if(count>10){
            throw new IllegalArgumentException("Phone cannot be less than 10 digits");
        }
        else if(count<10){
            throw new IllegalArgumentException("Phone cannot be more than 10 digits");}*/
        this.phone = phone;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        if(fax<1000000000){
            throw new IllegalArgumentException("Invalid fax");}
        /*int count=0;
        while(fax!=0){
            fax=fax/10;
            count++;
        }
        if(count>10){
            throw new IllegalArgumentException("Fax cannot be less than 10 digits");
        }
        else if(count<10){
            throw new IllegalArgumentException("Fax cannot be more than 10 digits");}*/
        
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        /*int s=email.length();
        for(int i=0;i<0;i++){
        }*/
            
        this.email = email;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        if(ssn<1000000000){
        throw new IllegalArgumentException("Invalid SSN");}
        /*int count=0;
        while(ssn!=0){
            ssn=ssn/10;
            count++;
        }
        if(count>10){
            throw new IllegalArgumentException("SSN cannot be less than 10 digits");
        }
        else if(count<10){
            throw new IllegalArgumentException("SSN cannot be more than 10 digits");}*/
        this.ssn = ssn;
    }

    public int getMed() {
        return med;
    }

    public void setMed(int med) {
        if(med<1000000000){
        throw new IllegalArgumentException("Invalid medical number");}
        /*int count=0;
        while(med!=0){
            med=med/10;
            count++;
        }
        if(count>10){
            throw new IllegalArgumentException("Medical Number cannot be less than 10 digits");
        }
        else if(count<10){
            throw new IllegalArgumentException("Medical Number cannot be more than 10 digits");}*/
        this.med = med;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
                if(hp<1000000000){
            throw new IllegalArgumentException("Invalid health number");}
        /*int count=0;
        while(hp!=0){
            hp=hp/10;
            count++;
        }
        if(count>10){
            throw new IllegalArgumentException("Health Plan Number cannot be less than 10 digits");
        }
        else if(count<10){
            throw new IllegalArgumentException("Health Plan Number cannot be more than 10 digits");}*/
        this.hp = hp;
    }

    public int getBa() {
        return ba;
    }

    public void setBa(int ba) {
                if(ba<1000000000){
            throw new IllegalArgumentException("Invalid bank account");}
        /*int count=0;
        while(ba!=0){
            ba=ba/10;
            count++;
        }
        if(count>10){
            throw new IllegalArgumentException("Bank Account cannot be less than 10 digits");
        }
        else if(count<10){
            throw new IllegalArgumentException("Bank Account cannot be more than 10 digits");}*/
        this.ba = ba;
    }

    public int getLn() {
        return ln;
    }

    public void setLn(int ln) {
            if(ln<1000000000){
            throw new IllegalArgumentException("Invalid licence number");}
        /*int count=0;
        while(ln!=0){
            ln=ln/10;
            count++;
        }
        if(count>10){
            throw new IllegalArgumentException("Licence Number cannot be less than 10 digits");
        }
        else if(count<10){
            throw new IllegalArgumentException("Licence Number cannot be more than 10 digits");}*/
        this.ln = ln;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        /*int count=0;
        while(vid!=0){
            vid=vid/10;
            count++;
        }
        if(count>10){
            throw new IllegalArgumentException("Vehicle ID cannot be less than 10 digits");
        }
        else if(count<10){
            throw new IllegalArgumentException("Vehicle ID cannot be more than 10 digits");}*/
        this.vid = vid;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
                if(did<1000000000){
            throw new IllegalArgumentException("Invalid Device ID");}
        /*int count=0;
        while(did!=0){
            did=did/10;
            count++;
        }
        if(count>10){
            throw new IllegalArgumentException("Device ID cannot be less than 10 digits");
        }
        else if(count<0){
            throw new IllegalArgumentException("Device ID cannot be more than 10 digits");}*/
        this.did = did;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getIp1() {
        return ip1;
    }

    public void setIp1(int ip1) {
        int count=0;
        while(ip1!=0){
            ip1=ip1/10;
            count++;
        }
        if(count>999){
            throw new IllegalArgumentException(" Invalid IP1");
        }
        else if(count<0){
            throw new IllegalArgumentException("Invalid IP1. ");}
        this.ip1 = ip1;
    }

    public int getIp2() {
        return ip2;
    }

    public void setIp2(int ip2) {
        int count=0;
        while(ip2!=0){
            ip2=ip2/10;
            count++;
        }
        if(count>999){
            throw new IllegalArgumentException("Invalid IP2");
        }
        else if(count<0){
            throw new IllegalArgumentException("Invalid IP2.");}
        this.ip2 = ip2;
    }

    public int getIp3() {
        return ip3;
    }

    public void setIp3(int ip3) {
        int count=0;
        while(ip3!=0){
            ip3=ip3/10;
            count++;
        }
        if(count>999){
            throw new IllegalArgumentException("Invalid IP3 ");
        }
        else if(count<0){
            throw new IllegalArgumentException("Invalid IP3.");}
        this.ip3 = ip3;
    }

    public int getIp4() {
        return ip4;
    }

    public void setIp4(int ip4) {
        int count=0;
        while(ip4!=0){
            ip4=ip4/10;
            count++;
        }
        if(count>999){
            throw new IllegalArgumentException("Invalid IP4");
        }
        else if(count<0){
            throw new IllegalArgumentException("Invalid IP4.");}
        this.ip4 = ip4;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
                if(uid<1000000000){
            throw new IllegalArgumentException("Invalid Unique ID");}
        /*int count=0;
        while(uid!=0){
            uid=uid/10;
            count++;
        }
        if(count>10){
            throw new IllegalArgumentException("Unique ID cannot be less than 10 digits");
        }
        else if(count<10){
            throw new IllegalArgumentException("Unique ID cannot be more than 10 digits");}*/
        this.uid = uid;
    }

    public String getSelectedImagePath() {
        return SelectedImagePath;
    }

    public void setSelectedImagePath(String SelectedImagePath) {
        this.SelectedImagePath = SelectedImagePath;
    }
}
