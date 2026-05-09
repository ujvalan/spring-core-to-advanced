package com.telusko.service;

public class SystemDesign implements ICourse
{

	public SystemDesign()
	{
		System.out.println("System design bean created");
	}
	@Override
	public boolean registerTheCourse(double amount)
	{
		System.out.println("Registered in SystemDesign course of Telusko and fees paid is "+amount);
		return true;
	}
}
