package com.microservices.currencyexchangeservice;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import jakarta.servlet.ServletContext;

public class DefaultRegistration {

	public void noWebMvcRegister(ServletContext servletContext) {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext ctx = null;
		ctx.setServletContext(servletContext);
	}
	
	
}
