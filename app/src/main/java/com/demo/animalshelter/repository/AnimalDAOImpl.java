package com.demo.animalshelter.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.demo.animalshelter.dto.AnimalDTO;
import com.demo.animalshelter.entity.Adopter;
import com.demo.animalshelter.entity.Animal;
import com.google.inject.Inject;

public class AnimalDAOImpl implements AnimalDAO {

	@Inject
	private EntityManager em;

	public void addAnimal(AnimalDTO animalDTO) {
		em.getTransaction().begin();
		Animal animal = new Animal();
		animal.setaName(animalDTO.getaName());
		animal.setaType(animalDTO.getaType());
		em.persist(animal);
		em.getTransaction().commit();
	}

	public void gotAdopted(Integer aid, String email) {
		Animal animal = em.find(Animal.class, aid);
		if (animal != null) {
			Adopter adopter = em.find(Adopter.class, email);
			if (adopter != null) {
				em.getTransaction().begin();
				animal.setAdopter(adopter);
			} else {
				throw new PersistenceException("No Such Adopter email found, cannot adopt");
			}
		} else {
			throw new PersistenceException("No such animal found, cannot adopt");
		}
		em.getTransaction().commit();
	}
}
