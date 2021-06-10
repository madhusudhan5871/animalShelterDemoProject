package com.demo.animalshelter.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aId;
	
	@Column
	private String aName;
	
    @Enumerated(EnumType.STRING)
	private AnimalType aType;
    
    @ManyToOne()
    private Adopter adopter;

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

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

	public Adopter getAdopter() {
		return adopter;
	}

	public void setAdopter(Adopter adopter) {
		this.adopter = adopter;
	}

	@Override
	public String toString() {
		return "Animal [aId=" + aId + ", aName=" + aName + "]";
	}
    
    
	
}
