package com.telusko.service;

import org.springframework.stereotype.Service;

@Service("ai")
public class AIEngineering implements ICourse
{

	public AIEngineering()
	{
		System.out.println("AI Eng bean");
	}
	
	@Override
	public boolean registerTheCourse(double amount)
	{
		System.out.println("Registered in AI ENGINEERING course of Telusko and fees paid is "+amount);
		return true;
	}
}
