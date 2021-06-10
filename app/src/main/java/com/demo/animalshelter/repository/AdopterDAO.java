package com.demo.animalshelter.repository;

import com.demo.animalshelter.dto.AdopterDTO;
import com.demo.animalshelter.entity.Adopter;

public interface AdopterDAO {
	void addAdopter(AdopterDTO adopterDTO);
	void delete(String adopterEmail);
	Adopter find(String adopterEmail);
	Adopter update(AdopterDTO adopterDTO);
}
