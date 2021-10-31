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
public class Person extends Person_Directory{
    private String firstname;
	private String lastname;
	private long contactno;
	private int zipcode;

    public Person(String firstname, String lastname, long contactno, int zipcode) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactno = contactno;
        this.zipcode = zipcode;
    }
	
        public Person(){
            
        }
        
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
