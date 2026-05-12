package com.telusko.SpringJdbcProject;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringJdbcProject.model.Employee;
import com.telusko.SpringJdbcProject.repo.EmployeeRepo;

@SpringBootApplication
public class SpringJdbcProjectApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container=SpringApplication.run(SpringJdbcProjectApplication.class, args);
		
		EmployeeRepo repo= container.getBean(EmployeeRepo.class);
		
//		List<Employee> employees = repo.getEmployeeInfo();
//		
//		for(Employee e : employees)
//		{
//			System.out.println(e);
//		}
		
		repo.getEmployeeInfo().forEach(e -> System.out.println(e));
	}

}
