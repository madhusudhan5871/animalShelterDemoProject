package com.demo.animalshelter.repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.demo.animalshelter.dto.AdopterDTO;
import com.demo.animalshelter.entity.Adopter;

public class AdopterDAOImpl implements AdopterDAO{
	private EntityManager em = Persistence.createEntityManagerFactory("animalShelter").createEntityManager();
	
	public void addAdopter(AdopterDTO adopterDTO) {
		em.getTransaction().begin();
		Adopter adopter = new Adopter();
		adopter.setAdopterEmail(adopterDTO.getAdopterEmail());
		adopter.setAdopterName(adopterDTO.getAdopterName());
		adopter.setPhoneNumber(adopterDTO.getPhoneNumber());
		em.persist(adopter);
		em.getTransaction().commit();
	}
	
	public void delete(String adopterEmail) {
		em.getTransaction();
		Adopter adopter = em.find(Adopter.class, adopterEmail);
		if(adopter != null) em.remove(adopter);
		else throw new PersistenceException("There is no adopter with email "+adopterEmail);
		em.getTransaction().commit();
	}
}
