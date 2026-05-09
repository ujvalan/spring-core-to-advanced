package com.telusko.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //java config is not recomended
@ComponentScan(basePackages= {"com.telusko"})
public class Config {
	
	public Config() {
		System.out.println("Config bean created");
	}
	public Password config1() {
		Password pass=new Password("SHA");
		return pass;
	}
}
