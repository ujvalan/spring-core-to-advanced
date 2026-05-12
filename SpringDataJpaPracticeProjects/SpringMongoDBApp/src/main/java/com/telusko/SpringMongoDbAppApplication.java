package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.dto.CustomerDto;
import com.telusko.service.CustomerService;
import com.telusko.util.IDGenerator;

@SpringBootApplication
public class SpringMongoDbAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringMongoDbAppApplication.class, args);
		
		CustomerService service = container.getBean(CustomerService.class);
		String id=IDGenerator.generateId();
		CustomerDto dto=new CustomerDto(id,7,"teja","Nellore");
		
		String status = service.registerCustomer(dto);
		
		System.out.println(status);
		
		System.out.println("********************************");
		
		service.findAllCustomers().forEach(c->System.out.println(c));
		
		System.out.println("*********************************");
		
		String dStatus = service.removeCustomerInfoById("5d34fb41-a77d-4487-97c1-0694bde16ad1");
		
		System.out.println(dStatus);
	}
	

}
