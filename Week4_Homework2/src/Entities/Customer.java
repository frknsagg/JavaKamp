package Entities;
import java.time.LocalDate;
import java.util.Date;

import Abstract.Entity;


public class Customer implements Entity  {
	private int id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityId;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, Date date, String nationalityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = date;
		this.nationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	

}
