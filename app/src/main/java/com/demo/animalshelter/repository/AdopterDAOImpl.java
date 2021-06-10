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
		//Adopter adopter = em.find(Adopter.class, adopterEmail);
		//if(adopter == null) throw new PersistenceException("There is no adopter with email "+adopterEmail);
		Adopter adopter = find(adopterEmail);
		em.getTransaction().begin();
		em.remove(adopter);
		em.getTransaction().commit();
	}
	
	public Adopter find(String adopterEmail) {
		Adopter adopter = em.find(Adopter.class, adopterEmail);
		if(adopter == null) throw new PersistenceException("There is no adopter with email "+adopterEmail);
		return adopter;
	}
	
	public Adopter update(AdopterDTO adopterDTO) {
		Adopter adopter = find(adopterDTO.getAdopterEmail());
		em.getTransaction().begin();
		adopter.setAdopterName(adopterDTO.getAdopterName());
		adopter.setPhoneNumber(adopterDTO.getPhoneNumber());
		em.getTransaction().commit();
		return adopter;
	}
}
