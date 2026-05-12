package com.telusko.SpringDataJpaProject;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpaProject.service.VaccineService;

@SpringBootApplication
public class SpringDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpaProjectApplication.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);

//		Vaccine v=service.fetchVaccineById(53);
//		System.out.println(v);
		
//		service.fetchByGivenVaccinesInfo(new Vaccine("Influenza","ciple",2456.3))
//		.forEach(v1->System.out.println(v1));
		
		ArrayList<Integer> ids=new ArrayList<>();
		
		ids.add(152);
		ids.add(153);
		ids.add(54);
		
		String status=service.removeVaccinesByGivenIds(ids);
		
		System.out.println(status);
		
	}

}
