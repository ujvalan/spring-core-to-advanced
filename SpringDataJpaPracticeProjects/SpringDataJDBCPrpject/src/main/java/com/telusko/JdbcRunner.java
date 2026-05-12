package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.telusko.model.Employee;
import com.telusko.repo.IEmployeeRepo;

public class JdbcRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepo repo;
	@Override
	public void run(String... args) throws Exception {

		repo.input(new Employee(1,"Dheeraj","udupi", 0));
	}

}
