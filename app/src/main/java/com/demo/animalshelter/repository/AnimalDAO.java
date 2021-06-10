package com.demo.animalshelter.repository;

import com.demo.animalshelter.dto.AnimalDTO;

public interface AnimalDAO {
	void addAnimal(AnimalDTO animalDTO);

	void gotAdopted(Integer aid, String email);
}
