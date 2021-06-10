package com.demo.animalshelter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import javax.validation.executable.ValidateOnExecution;

@Entity
public class Adopter {
	@Column
	private String adopterName;
	
	@Id
	private String adopterEmail;
	
	@Column
	@Size(min=10, message="Phone number should be of 10 digits")
	private String phoneNumber;
	
	public String getAdopterName() {
		return adopterName;
	}
	public void setAdopterName(String adopterName) {
		this.adopterName = adopterName;
	}
	public String getAdopterEmail() {
		return adopterEmail;
	}
	public void setAdopterEmail(String adopterEmail) {
		this.adopterEmail = adopterEmail;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Adopter [adopterName=" + adopterName + ", adopterEmail=" + adopterEmail + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	
}
