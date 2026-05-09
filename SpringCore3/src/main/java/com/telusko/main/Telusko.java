package com.telusko.main;

import com.telusko.service.ICourse;

public class Telusko
{
	private ICourse course;
	

	
	public Telusko(ICourse course) {
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
