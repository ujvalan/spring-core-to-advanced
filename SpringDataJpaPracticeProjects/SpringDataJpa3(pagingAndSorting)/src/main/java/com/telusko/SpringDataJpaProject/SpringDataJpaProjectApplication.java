package com.telusko.SpringDataJpaProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpaProject.model.Vaccine;
import com.telusko.SpringDataJpaProject.service.VaccineService;

@SpringBootApplication
public class SpringDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpaProjectApplication.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);

		//service.fetchDetailsBySorting(false,"vaccineName").forEach(v->System.out.println(v)); //return type of this method is collection.
		
//		service.fetchVaccineInfoByPagination(1, 2, true, "vaccineName")
//		.forEach(v->System.out.println(v));
		
		service.fetchVaccineInfoByPagination(4);
	}

}
