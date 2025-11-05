package com.microservices.currencyexchangeservice;

import jakarta.servlet.ServletContext;

public class NspWebServletContextProvider {

	private static ServletContext srvContext;
	
	public NspWebServletContextProvider(ServletContext srv) {
		srvContext = srv;
	}

	public static ServletContext getSrvContext() {
		return srvContext;
	}
	
}
