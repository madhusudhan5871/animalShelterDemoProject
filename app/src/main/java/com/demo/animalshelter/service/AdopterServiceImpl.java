package com.demo.animalshelter.service;

import java.util.List;

import javax.persistence.PersistenceException;

import com.demo.animalshelter.dto.AdopterDTO;
import com.demo.animalshelter.entity.Adopter;
import com.demo.animalshelter.repository.AdopterDAO;
import com.google.inject.Inject;

public class AdopterServiceImpl implements AdopterService {

	@Inject
	private AdopterDAO adopterDAO;

	public void addAdopter(AdopterDTO adopterDTO) {
		try {
			adopterDAO.addAdopter(adopterDTO);
			System.out.println("Record Insertion successful " + adopterDTO);
		} catch (PersistenceException ex) {
			System.out.println("Some Database exception has occured: " + ex.getMessage() + ex.getCause());
		} catch (Exception ex) {
			System.out.println("Some general exception has occured: " + ex.getMessage() + ex.getCause());
		}
	}

	public void delete(String adopterEmail) {
		try {
			adopterDAO.delete(adopterEmail);
			System.out.println("Record deletion successful with email: " + adopterEmail);
		} catch (PersistenceException ex) {
			System.out.println("Some database exception has occured: " + ex.getMessage() + ex.getCause());
		} catch (Exception ex) {
			System.out.println("Some general exception has occured: " + ex.getMessage() + ex.getCause());
		}
	}

	public void find(String adopterEmail) {
		try {
			Adopter adopter = adopterDAO.find(adopterEmail);
			System.out.println("FOund record: " + adopter);
			System.out.println("ANimals  " + adopter.getAnimal());

		} catch (PersistenceException ex) {
			System.out.println("Some database exception has occured: " + ex.getMessage() + ex.getCause());
		} catch (Exception ex) {
			System.out.println("Some general exception has occured: " + ex.getMessage() + ex.getCause());
		}
	}

	public void update(AdopterDTO adopterDTO) {
		try {
			System.out.println("Updated record successfully: " + adopterDAO.update(adopterDTO));
		} catch (PersistenceException ex) {
			System.out.println("Some database exception has occured: " + ex.getMessage() + ex.getCause());
		} catch (Exception ex) {
			System.out.println("Some general exception has occured: " + ex.getMessage() + ex.getCause());
		}
	}

	public List<Adopter> findByName(String adopterName) {
		List<Adopter> adopterList = null;
		//try {
			adopterList = adopterDAO.findByName(adopterName);
			System.out.println(adopterList);
		//} catch (PersistenceException ex) {
		//	System.out.println("Some database exception has occured: " + ex.getMessage() + ex.getCause());
		//} catch (Exception ex) {
		//	System.out.println("Some general exception has occured: " + ex.getMessage() + ex.getCause());
		//}
		return adopterList;
	}

	public void findByPhone(String adopterPhone) {
		try {
			System.out.println(adopterDAO.findByPhone(adopterPhone));
		} catch (PersistenceException ex) {
			System.out.println("Some database exception has occured: " + ex.getMessage() + ex.getCause());
		} catch (Exception ex) {
			System.out.println("Some general exception has occured: " + ex.getMessage() + ex.getCause());
		}
	}
}
