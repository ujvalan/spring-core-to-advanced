package com.telusko.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.telusko.model.Employee;

@Repository("repo")
public class EmployeeRepo implements IEmployeeRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//private String sql="INSERT INTO EMPLOYEE(id,name,role,salary) VALUES(1,'Pratibha','Benguluru";
	private String sql="INSERT INTO EMPLOYEE(id, name, role, salary) VALUES(?,?,?,?)";
	
	
	
	
	@Override
	public void input(Employee emp) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(sql);
		
//		Integer id=emp.getId();
//		String name=emp.getName();
//		String role=emp.getRole();
//		Double salary=emp.getSalary();
		
		jdbcTemplate.update(sql,emp.getId(),emp.getName(),emp.getRole(),emp.getSalary());
		
	}

	
}


