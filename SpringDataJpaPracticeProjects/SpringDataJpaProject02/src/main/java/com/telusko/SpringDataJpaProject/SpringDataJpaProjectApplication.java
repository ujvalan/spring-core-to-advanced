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
//		String status = service.registerVaccineDetails(new Vaccine("Covaxin","BharatBio",45455.4));
//		
//		System.out.println(status);
    	List<Vaccine> vaccines=new ArrayList<>();
    	vaccines.add(new Vaccine("Moderena","pfizer",454556.4));
		vaccines.add(new Vaccine("Covaxin","BharatBio",45455.4));
////		
//		vaccines.add(new Vaccine("Moderena","Phizer",200000.0));
//		vaccines.add(new Vaccine("Influenza","ciple",2456.3));
//		vaccines.add(new Vaccine("Java","Telusko",8585.4));
				
    	Iterable<Vaccine> vac=service.registerMultipleVaccines(vaccines);
    	
    	System.out.println("Vaccines added successfully ");
//		for(Vaccine v:vac) {
//			System.out.println(v);
//		}
//		Iterator<Vaccine> itr=vac.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
// using lambda expressions use decrease the line of the code
		
		//service.registerMultipleVaccines(vaccines).forEach(v->System.out.println(v));
		
//		long count=service.count();
//		System.out.println("Number of Vaccine info in our records : "+count);
//		int id=4;
//		boolean status=service.checkAvailability(id);
//		if(status)
//			System.out.println("Vaccine with id "+ id + " is available");
//		else
//			System.out.println("Vaccine with id "+ id+ " is unavailable");
		List<Integer> ids=new ArrayList<>();
		//service.fetchAllVaccines().forEach(v->System.out.println(v));
		ids.add(2);
		//ids.add(153);
		//		service.fetchAllVaccinesByIds(ids).forEach(v->System.out.println(v));;
		
		
//		
//		Optional<Vaccine> optional=service.fetchVaccineById(id);
//		if(optional.isPresent())
//			System.out.println(optional.get());
//		else
//			System.out.println("No Vaccine with id: "+id);
//		String status = service.removeVaccineById(5);
//		System.out.println(status);
//		
//		String status = service.removeVaccineByIds(ids);
//		System.out.println(status);
	}

}
