/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
import java.awt.*;  
import java.awt.event.*;  
import java.awt.image.*;  
import javax.swing.*;  
import java.awt.Frame;  
import java.awt.event.WindowAdapter;  
import java.awt.event.WindowEvent;

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
    private int did; /*Device identifier*/
    private String link; /*LinkedIn*/
    private int ip1; /*IP Address*/
    private int ip2; /*IP Address*/
    private int ip3; /*IP Address*/
    private int ip4; /*IP Address*/
    private int uid; /*Unique ID*/
    
    public int getIp1() {
        return ip1;
    }

    public void setIp1(int ip1) {
        if (ip1<0){
            throw new IllegalArgumentException("Please enter valid ip1 address");
        } else if(ip1>999){
            throw new IllegalArgumentException("Please enter valid ip1 address.");
        }
        this.ip1 = ip1;
    }

    public int getIp2() {
        return ip2;
    }

    public void setIp2(int ip2) {
        if (ip2<0){
            throw new IllegalArgumentException("Please enter valid ip2 address");
        } else if(ip2>999){
            throw new IllegalArgumentException("Please enter valid ip2 address.");
        }
        this.ip2 = ip2;
    }

    public int getIp3() {
        return ip3;
    }

    public void setIp3(int ip3) {
        if (ip3<0){
            throw new IllegalArgumentException("Please enter valid ip3 address");
        } else if(ip3>999){
            throw new IllegalArgumentException("Please enter valid ip3 address.");
        }
        this.ip3 = ip3;
    }

    public int getIp4() {
        return ip4;
    }

    public void setIp4(int ip4) {
        if (ip4<0){
            throw new IllegalArgumentException("Please enter valid ip4 address");
        } else if(ip4>999){
            throw new IllegalArgumentException("Please enter valid ip4 address.");
        }
        this.ip4 = ip4;
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
        int faxcount=0;
        ssn=sc.nextInt();
        while(fax!=0){
            fax=fax/10;
            faxcount++;             
        }
        if (faxcount<10){
            throw new IllegalArgumentException("Please enter valid FAX number");
        } else if(faxcount>10){
            throw new IllegalArgumentException("Please enter valid FAX number.");
        }
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
        while(ssn!=0){
            ssn=ssn/10;
            ssncount++;             
        }
        if (ssncount<10){
            throw new IllegalArgumentException("Please enter valid SSN");
        } else if(ssncount>10){
            throw new IllegalArgumentException("Please enter valid SSN.");
        }
        this.ssn = ssn;
    }

    public int getMed() {
        return med;
    }

    public void setMed(int med) {
        int medcount=0;
        med=sc.nextInt();
        while(med!=0){
            med=med/10;
            medcount++;             
        }
        if (medcount<10){
            throw new IllegalArgumentException("Please enter valid medical record number");
        } else if(medcount>10){
            throw new IllegalArgumentException("Please enter valid medical record number.");
        }
        this.med = med;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        int hpcount=0;
        hp=sc.nextInt();
        while(hp!=0){
            hp=hp/10;
            hpcount++;             
        }
        if (hpcount<10){
            throw new IllegalArgumentException("Please enter valid health plan number");
        } else if(hpcount>10){
            throw new IllegalArgumentException("Please enter valid health plan number.");
        }
        this.hp = hp;
    }

    public int getBa() {
        return ba;
    }

    public void setBa(int ba) {
        int bacount=0;
        ba=sc.nextInt();
        while(ba!=0){
            ba=ba/10;
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
        int lncount=0;
        ln=sc.nextInt();
        while(ln!=0){
            ln=ln/10;
            lncount++;             
        }
        if (lncount<8){
            throw new IllegalArgumentException("Please enter valid licence number");
        } else if(lncount>8){
            throw new IllegalArgumentException("Please enter valid licence number.");
        }
        this.ln = ln;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        int vidcount=0;
        vid=sc.nextInt();
        while(vid!=0){
            vid=vid/10;
            vidcount++;             
        }
        if (vidcount<10){
            throw new IllegalArgumentException("Please enter valid vehicle identification");
        } else if(vidcount>10){
            throw new IllegalArgumentException("Please enter valid behicle identification.");
        }
        this.vid = vid;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        int didcount=0;
        did=sc.nextInt();
        while(did!=0){
            did=did/10;
            didcount++;             
        }
        if (didcount<9){
            throw new IllegalArgumentException("Please enter valid device identification");
        } else if(didcount>9){
            throw new IllegalArgumentException("Please enter valid device identification.");
        }
        this.did = did;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        int uidcount=0;
        uid=sc.nextInt();
        while(uid!=0){
            phone=phone/10;
            uidcount++;             
        }
        if (uid<10){
            throw new IllegalArgumentException("Please enter valid ssn number");
        } else if(uid>10){
            throw new IllegalArgumentException("Please enter valid ssn number.");
        }
        this.uid = uid;
    }
    }
