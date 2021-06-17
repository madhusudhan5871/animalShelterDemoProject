package com.demo.animalshelter.service;

import java.util.List;

import com.demo.animalshelter.dto.AdopterDTO;
import com.demo.animalshelter.entity.Adopter;

public interface AdopterService {
	void addAdopter(AdopterDTO adopterDTO);
	void delete(String adopterEmail);
	void find(String adopterEmail);
	void update(AdopterDTO adopterDTO);
	List<Adopter> findByName(String name);
	void findByPhone(String phoneNumber);
}
