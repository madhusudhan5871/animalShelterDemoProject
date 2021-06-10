package com.demo.animalshelter.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

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
	
	public List<Adopter> findByName(String adopterName) {
		Query q = em.createNamedQuery("Adopter.findByName");
		q.setParameter(1, adopterName);
		List<Adopter> adopterList = q.getResultList();
		return adopterList;
	}
	
	public Adopter findByPhone(String phoneNumber) {
		Query q = em.createNamedQuery("Adopter.findByPhone");
		q.setParameter(1, phoneNumber);
		Adopter adopter = (Adopter)q.getSingleResult();
		return adopter;
	}
}
