package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchMain {

	public static void main(String[] args) {

		//ApplicationContext
		//BeanFactory
		
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
	}

}
