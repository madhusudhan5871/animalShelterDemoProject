package com.demo.animalshelter.service;

import com.demo.animalshelter.dto.AdopterDTO;

public interface AdopterService {
	void addAdopter(AdopterDTO adopterDTO);
	void delete(String adopterEmail);
	void find(String adopterEmail);
	void update(AdopterDTO adopterDTO);
}
