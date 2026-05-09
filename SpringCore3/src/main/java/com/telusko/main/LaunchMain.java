package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchMain
{
	public static void main(String[] args)
	{
		//ApplicationContext
		//BeanFactory
		
		ApplicationContext container =new
				ClassPathXmlApplicationContext("applicationconfig.xml");
		
//		Telusko tel = (Telusko) container.getBean("telusko");
		
//		Telusko tel=container.getBean("telusko", Telusko.class);
//		
//		Telusko tel = container.getBean(Telusko.class);	
		Telusko tel=container.getBean("telusko",Telusko.class);
//		
		tel.buyTheCouuse(4444.5);
		
	}

}
