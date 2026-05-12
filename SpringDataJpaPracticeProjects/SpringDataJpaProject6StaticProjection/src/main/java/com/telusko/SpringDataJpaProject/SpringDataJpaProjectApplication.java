package com.telusko.SpringDataJpaProject;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpaProject.service.VaccineService;

@SpringBootApplication
public class SpringDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpaProjectApplication.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);

		service.searchByCostLessThan(545454.5).forEach(v->System.out.println(v.getVaccineName()+" "+ v.getVaccineCompany()));
	}

}
