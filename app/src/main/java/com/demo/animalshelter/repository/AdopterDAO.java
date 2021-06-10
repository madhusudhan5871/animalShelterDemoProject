package com.demo.animalshelter.repository;

import com.demo.animalshelter.dto.AdopterDTO;

public interface AdopterDAO {
	void addAdopter(AdopterDTO adopterDTO);
	void delete(String adopterEmail);
}
