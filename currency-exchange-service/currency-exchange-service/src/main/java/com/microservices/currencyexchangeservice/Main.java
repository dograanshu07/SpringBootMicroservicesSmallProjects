package com.microservices.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;

import jakarta.servlet.FilterRegistration;
import jakarta.servlet.ServletContext;

@Configuration
public class Main implements ServletContextAware {
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		// TODO Auto-generated method stub
		new NspWebServletContextProvider(servletContext);
		new DefaultRegistration().noWebMvcRegister(servletContext);
		RestApiFilter cacheFilter = new RestApiFilter();
		FilterRegistration.Dynamic cacheControlFilter = servletContext.addFilter("apifilter", cacheFilter);
		cacheControlFilter.addMappingForServletNames(null, true,"/*");
	}

}
