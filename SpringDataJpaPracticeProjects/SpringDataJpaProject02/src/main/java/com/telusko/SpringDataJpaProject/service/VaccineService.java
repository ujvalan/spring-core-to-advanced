package com.telusko.SpringDataJpaProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpaProject.model.Vaccine;
import com.telusko.SpringDataJpaProject.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService {
    
	@Autowired
	private IVaccineRepo repo;
	
	
	
	@Override
	public String registerVaccineDetails(Vaccine vaccine) {
		//after saving it is comming  back from the databse
		
		System.out.println("IVaccineRepo is implemented by : "+repo.getClass().getName());
		Vaccine vac=repo.save(vaccine);
		return "Vaccine Info Stored with id "+vac.getVaccineName();
	}


	@Override
	public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) {
		// TODO Auto-generated method stub
		return repo.saveAll(vaccines);
	}


	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return repo.count();
	}


	@Override
	public Boolean checkAvailability(Integer id) {
		
		return repo.existsById(id);
		
	}


	@Override
	public Iterable<Vaccine> fetchAllVaccines() {

		return repo.findAll();
	}


	@Override
	public Iterable<Vaccine> fetchAllVaccinesByIds(Iterable<Integer> ids) {

		return repo.findAllById(ids);
		
	}


	@Override
	public Optional<Vaccine> fetchVaccineById(Integer id) {
		
		
		return repo.findById(id);
	}

	@Override
	public String removeVaccineById(Integer id) {

//		Optional<Vaccine> optional = repo.findById(id);
//		if(optional.isPresent()) {
//			repo.deleteById(id);
//			return "Vaccine Record with id "+id+" is deleted";
//		}
//		return "There is no vaccine with id "+id+" to delete";
//		
		Boolean status = repo.existsById(id);
		if(status) {
			repo.deleteById(id);
			return "Vaccine Record with id "+id+" is deleted";
			
		}
		return "There is no Vaacine with id "+id+" to delete";
	}

	@Override
	public String removeVaccineByObj(Vaccine obj) {

		Integer id=obj.getId();
		Optional<Vaccine> optional=repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return "Vaccine Record with id "+id+" is deleted";
			
		}
		return "There is no vaccine with id "+id+" to delete";
	}


	@Override
	public String removeVaccineByIds(List<Integer> ids) {
		List<Vaccine> vaccines=(List<Vaccine>) repo.findAllById(ids);
		int count1=ids.size();
		int count2=vaccines.size();
//		if(count1==count2) {
//			repo.deleteAllById(ids);
//			return "Vaccines are deleted from records";
//		}
		if(count2>0) {
			repo.deleteAllById(ids);
			return "Vaccines are deleted from records";
			}
		return "Failed to delete Vaccine Info";
	}


	

}
