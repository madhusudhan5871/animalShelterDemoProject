package com.demo.animalshelter.dto;

import com.demo.animalshelter.entity.AnimalType;

public class AnimalDTO {
	private String aName;
	private AnimalType aType;
	private AdopterDTO adopterDTO;
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public AnimalType getaType() {
		return aType;
	}
	public void setaType(AnimalType aType) {
		this.aType = aType;
	}
	public AdopterDTO getAdopterDTO() {
		return adopterDTO;
	}
	public void setAdopterDTO(AdopterDTO adopterDTO) {
		this.adopterDTO = adopterDTO;
	}
	@Override
	public String toString() {
		return "AnimalDTO [aName=" + aName + ", aType=" + aType + ", adopterDTO=" + adopterDTO + "]";
	}
	
}
