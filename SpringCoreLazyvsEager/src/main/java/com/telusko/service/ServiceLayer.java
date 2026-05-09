package com.telusko.service;

import org.springframework.stereotype.Service;


public class ServiceLayer {
	
	public ServiceLayer() {
		System.out.println("Service Bean created");
	}
	
	public void disp() {
		System.out.println("visit telusko.com");
	}
	
}
