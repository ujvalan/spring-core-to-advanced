package com.telusko.main;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaunchMain {

	public static void main(String[] args) {

		//ApplicationContext
		//BeanFactory
		
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
	}

}
