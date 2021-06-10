package com.demo.animalshelter.dto;

public class AdopterDTO {
	
	private String adopterName;
	private String adopterEmail;
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
		return "AdopterDTO [adopterName=" + adopterName + ", adopterEmail=" + adopterEmail + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
}
