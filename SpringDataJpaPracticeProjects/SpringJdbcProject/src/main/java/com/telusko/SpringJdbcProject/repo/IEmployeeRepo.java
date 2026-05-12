package com.telusko.SpringJdbcProject.repo;

import java.util.List;

import com.telusko.SpringJdbcProject.model.Employee;

public interface IEmployeeRepo {

	List<Employee> getEmployeeInfo();
}
