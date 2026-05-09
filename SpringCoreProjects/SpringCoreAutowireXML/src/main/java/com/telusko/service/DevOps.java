package com.telusko.service;

public class DevOps implements ICourse
{

	public DevOps()
	{
		System.out.println("DevOps bean created");
	}
	@Override
	public boolean registerTheCourse(double amount)
	{
		System.out.println("Registered in DevOps course of Telusko and fees paid is "+amount);
		return true;
	}

}
