package com.demo.animalshelter.dto;

import java.util.List;

public class AdopterDTO {
	
	private String adopterName;
	private String adopterEmail;
	private String phoneNumber;
	private List<AnimalDTO> animal;
	
	public List<AnimalDTO> getAnimal() {
		return animal;
	}
	public void setAnimal(List<AnimalDTO> animal) {
		this.animal = animal;
	}
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
				+ phoneNumber + ", animal=" + animal + "]";
	}
	
}
