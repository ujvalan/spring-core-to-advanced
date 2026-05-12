package com.telusko.SpringDataJpaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpaProject.service.VaccineService;

//SQL //SELECT * FROM vaccine WHERE vaccine_company=?
	//HQL //FROM Vaccine where vaccineComapny=:company
	
	
	//SQL --> SELECT * FROM vaccine WHERE vaccine_company In(?,?)
	//HQL --> FROM Vaccine Where vaccineCompany IN(?,?)

	//SQL --> SELECT vaccine_name FROM vaccine WHERE vaccine_company IN(?,?)
	
	//HQL --> SELECT vaccineName from Vaccine WHERE vaccineCompany IN(:comp1, :comp2


@SpringBootApplication
public class SpringDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpaProjectApplication.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);

//		service.fetchByVaccineCompany("Telusko").
//		forEach(v->System.out.println(v));
//		
//		System.out.println("*********************");
//		service.fetchByVaccineCompanies("Telusko", "BharatBio").
//		forEach(v->System.out.println(v));
//		
//		System.out.println("*********************");
//		service.searchVaccineNameByCost(454.4, 65655.5).
//		forEach(v->System.out.println(v));
		
		int rowsAffected=service.deleteTheVaccineByVaccineName("Moderena");
		System.out.println("Rows Effected : "+rowsAffected);
		
		
	}

}
