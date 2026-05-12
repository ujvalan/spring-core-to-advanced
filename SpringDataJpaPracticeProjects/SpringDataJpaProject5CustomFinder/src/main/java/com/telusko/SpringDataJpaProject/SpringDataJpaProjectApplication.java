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

//		service.searchByCost(2456.3).forEach(v->System.out.println(v));
//		
//		service.searchByCostIs(2456.3).forEach(v->System.out.println(v));
//		
//		service.searchByCostEquals(2456.3).forEach(v->System.out.println(v));
//		
		//service.searchByCostLessThanEqual(454556.4).forEach(v->System.out.println(v));
		
		//service.searchByCostBetween()
		
		//service.searchByCostBetween(2456.0,454556.4 ).forEach(v->System.out.println(v));
		
		//service.searchByVaccineCompanyEquals("BharatBio").forEach(v->System.out.println(v));
		
		Collection<String> names=new HashSet<>();
		
		names.add("Moderena");
		
		names.add("Influenza");
		
		names.add("Covaxin");
		
		
		service.searchByVaccineNameInAndCostBetween(names,2456.3 ,454556.4).forEach(v->System.out.println(v));
		
		
	}

}
