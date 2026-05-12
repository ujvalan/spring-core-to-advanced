package com.telusko.SpringDataJpaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpaProject.service.VaccineService;
import com.telusko.SpringDataJpaProject.view.ResultView2;

@SpringBootApplication
public class SpringDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpaProjectApplication.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);

//		service.searchByCostLessThan(45455.5,ResultView1.class).
//		forEach(v->System.out.println(v.getVaccineName()));
		

		service.searchByCostLessThan(45455.5,ResultView2.class).
		forEach(v->System.out.println(v.getVaccineName()+" "+ v.getVaccineCompany()+" "+v.getCost()));
		
	}

}
