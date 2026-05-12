package com.telusko.SpringJdbcProject.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.telusko.SpringJdbcProject.model.Employee;

@Repository("repo")
public class EmployeeRepo implements IEmployeeRepo {

	private static final String SQL_QUERY = "SELECT * FROM Employee";
	@Autowired
	private DataSource dataSource;
	
	List<Employee> employees=null;
	
	@Override
	public List<Employee> getEmployeeInfo() {

		//register
		//Connection we are getting connection from hikariCP
		try {
			Connection connection =dataSource.getConnection();
			System.out.println("DataSource impl is "+dataSource.getClass().getName());
			
			PreparedStatement pstmt = connection.prepareStatement(SQL_QUERY);
			
			ResultSet rs =pstmt.executeQuery();
			
			employees=new ArrayList<>();
			
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setRole(rs.getString(3));
				emp.setSalary(rs.getDouble(4));
				
				employees.add(emp);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}

}
