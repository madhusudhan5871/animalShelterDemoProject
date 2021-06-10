package com.demo.animalshelter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@NamedQuery(name = "Adopter.findByName", query = "FROM Adopter where adopterName = ?1")
@NamedNativeQuery(name="Adopter.findByPhone", query = "select * from adopter where phoneNumber = ?", resultClass = Adopter.class)
public class Adopter {

	@Id
	private String adopterEmail;

	@Column
	private String adopterName;

	@Column
	@Size(min = 10, message = "Phone number should be of 10 digits")
	@Pattern(regexp = "[0-9]*", message = "Only numbers allowed")
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
