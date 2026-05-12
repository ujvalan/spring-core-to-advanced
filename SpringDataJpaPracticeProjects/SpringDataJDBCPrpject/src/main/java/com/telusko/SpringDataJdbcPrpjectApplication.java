package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.model.Employee;
import com.telusko.repo.EmployeeRepo;

@SpringBootApplication
public class SpringDataJdbcPrpjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJdbcPrpjectApplication.class, args);
		
		Employee emp=new Employee(1,"Sameer","Developer",100000);
		
		EmployeeRepo repo = container.getBean(EmployeeRepo.class);
		
		repo.input(emp);
		
		System.out.println("Check DB for Data");
		
	
	}

}
