package com.demo.animalshelter.service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.demo.animalshelter.dto.AnimalDTO;
import com.demo.animalshelter.entity.Animal;
import com.demo.animalshelter.repository.AnimalDAO;
import com.demo.animalshelter.repository.AnimalDAOImpl;

public class AnimalServiceImpl implements AnimalService {
	
	private AnimalDAO animalDAO = new AnimalDAOImpl();
	private EntityManager em = Persistence.createEntityManagerFactory("animalShelter").createEntityManager();

	public void addAnimal(AnimalDTO animalDTO) {
		try {
			animalDAO.addAnimal(animalDTO);
		}catch(PersistenceException ex) {
			System.out.println("Some database exception has occured: "+ ex.getMessage() + ex.getCause());
		}catch(Exception ex) {
			System.out.println("Some general exception has occured: "+ ex.getMessage() + ex.getCause());
		}
	}
	
	public void gotAdopted(Integer aid, String email) {
		try {
			animalDAO.gotAdopted(aid,email);
		}catch(PersistenceException ex) {
			System.out.println("Some database exception has occured: "+ ex.getMessage() + ex.getCause());
		}catch(Exception ex) {
			System.out.println("Some general exception has occured: "+ ex.getMessage() + ex.getCause());
		}
	}
	
	public void find(Integer aid) {
		Animal animal = em.find(Animal.class,aid);
		System.out.println(animal.getAdopter());
	}
}
