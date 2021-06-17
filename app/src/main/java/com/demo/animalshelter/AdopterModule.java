package com.demo.animalshelter;

import javax.inject.Provider;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.demo.animalshelter.repository.AdopterDAO;
import com.demo.animalshelter.repository.AdopterDAOImpl;
import com.demo.animalshelter.repository.AnimalDAO;
import com.demo.animalshelter.repository.AnimalDAOImpl;
import com.demo.animalshelter.service.AdopterService;
import com.demo.animalshelter.service.AdopterServiceImpl;
import com.demo.animalshelter.service.AnimalService;
import com.demo.animalshelter.service.AnimalServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;

public class AdopterModule extends AbstractModule{
	@Singleton
	private static class JPAInitializer {
	    @Inject
	    public JPAInitializer(final PersistService service) {
	        service.start();
	    }
	}
	
	public void configure() {
	    //install(new JpaPersistModule("animalShelter"));
	    bind(JPAInitializer.class).asEagerSingleton();
		bind(AdopterDAO.class).to(AdopterDAOImpl.class);
		bind(AnimalDAO.class).to(AnimalDAOImpl.class);
		bind(AdopterService.class).to(AdopterServiceImpl.class);
		bind(AnimalService.class).to(AnimalServiceImpl.class);
		
		//bind(EntityManager.class).toInstance(Persistence.createEntityManagerFactory("animalShelter").createEntityManager());
	}
}
