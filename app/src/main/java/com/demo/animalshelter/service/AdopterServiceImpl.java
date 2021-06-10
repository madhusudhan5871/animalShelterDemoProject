package com.demo.animalshelter.service;

import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import com.demo.animalshelter.dto.AdopterDTO;
import com.demo.animalshelter.repository.AdopterDAO;
import com.demo.animalshelter.repository.AdopterDAOImpl;

@Transactional
public class AdopterServiceImpl implements AdopterService{
	private AdopterDAO adopterDAO = new AdopterDAOImpl();	
	
	public void addAdopter(AdopterDTO adopterDTO) {
		try {
			adopterDAO.addAdopter(adopterDTO);
			System.out.println("Record Insertion successful "+adopterDTO);
		}catch(PersistenceException ex) {
			System.out.println("Some Database exception has occured: "+ ex.getMessage() + ex.getCause());
		}
	catch(Exception ex) {
			System.out.println("Some general exception has occured: "+ ex.getMessage() + ex.getCause());
		}
	}
	
	public void delete(String adopterEmail) {
		try {
			adopterDAO.delete(adopterEmail);
			
		}catch(PersistenceException ex) {
			System.out.println("Some database exception has occured: "+ ex.getMessage() + ex.getCause());
		}catch(Exception ex) {
			System.out.println("Some general exception has occured: "+ex.getCause());
		}
	}
}
