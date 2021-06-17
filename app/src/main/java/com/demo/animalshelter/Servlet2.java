package com.demo.animalshelter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.animalshelter.entity.Adopter;
import com.demo.animalshelter.entity.Animal;
import com.demo.animalshelter.service.AdopterService;
import com.demo.animalshelter.service.AdopterServiceImpl;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class Servlet2 extends HttpServlet {
	
	@Inject
	private AdopterService adopterService;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("adopterName");		
		PrintWriter out = res.getWriter();
		out.println("The name you had entered is "+name);
		//AdopterService adopterService = new AdopterServiceImpl();
		List<Adopter> adopterList = adopterService.findByName(name);
		out.println("<br>The animals adopter are: <br>");
		for(Adopter adopter:adopterList) {
			out.println("Adopter 1: <br>");
			List<Animal> animals = adopter.getAnimal();
			for(Animal animal:animals) {
				out.println(animal.getaName()+"<br>");
			}
			
		}
	}

}