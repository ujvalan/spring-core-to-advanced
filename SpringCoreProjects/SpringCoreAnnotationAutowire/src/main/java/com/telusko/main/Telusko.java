package com.telusko.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.telusko.service.ICourse;

@Component
public class Telusko

{
	//field
	
//	@Autowired
//	@Qualifier("ai")//qualifier dominating the primary
//	
	private ICourse course;
	

	//constructor
	@Autowired
	public Telusko(@Qualifier("ai")ICourse course) {
		super();
		System.out.println("Telusko Bean created");
		this.course = course;
	}
	

	public Telusko() {
		super();
		System.out.println("Telusko Bean created");
		// TODO Auto-generated constructor stub
	}


	//setter
	
	public void setCourse(ICourse course)//ICourse course=new DevOps();
	{
		this.course = course;
	}

	public boolean buyTheCouuse(double amount)
	{
	
//		Boolean status=course.registerTheCourse(amount);
//		return status;
		return course.registerTheCourse(amount);
	}

}
