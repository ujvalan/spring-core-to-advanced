package com.telusko.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.telusko.service.ServiceLayer;

public class LaunchMain {

	public static void main(String[] args) {

		//ApplicationContext -- Eager Loading
		//BeanFactory --Lazy Loading
		
//		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
//		
//		ServiceLayer service=container.getBean(ServiceLayer.class);
//		
//		service.disp();
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		//3. Load the bean definitions
		reader.loadBeanDefinitions(new ClassPathResource("applicationconfig.xml"));
		
		ServiceLayer service = factory.getBean(ServiceLayer.class);
		service.disp();
		
	}

}
