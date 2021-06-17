package com.demo.animalshelter;

import com.demo.animalshelter.service.AdopterService;
import com.google.inject.Inject;
import com.google.inject.servlet.ServletModule;

public class MyServletModule extends ServletModule {
	


   @Override
   protected void configureServlets() {
	    
          serve("/findadoptedanimals.html").with(Servlet2.class);
   }
}