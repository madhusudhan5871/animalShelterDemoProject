package com.demo.animalshelter.service;

import com.demo.animalshelter.dto.AnimalDTO;

public interface AnimalService {
	void addAnimal(AnimalDTO animalDTO);
	void gotAdopted(Integer i,String email);
	void find(Integer aid);
}
