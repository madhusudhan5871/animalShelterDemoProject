package com.demo.animalshelter.repository;

import java.util.List;

import com.demo.animalshelter.dto.AdopterDTO;
import com.demo.animalshelter.entity.Adopter;

public interface AdopterDAO {
	void addAdopter(AdopterDTO adopterDTO);
	void delete(String adopterEmail);
	Adopter find(String adopterEmail);
	Adopter update(AdopterDTO adopterDTO);
	List<Adopter> findByName(String adopterName);
	Adopter findByPhone(String phone);
}
