package com.telusko.service;

import java.util.List;

import com.telusko.dto.CustomerDto;
import com.telusko.model.Customer;

public interface ICustomerService {

	String registerCustomer(CustomerDto dto);
	
	List<Customer> findAllCustomers();
	
	String removeCustomerInfoById(String id);
	
}
