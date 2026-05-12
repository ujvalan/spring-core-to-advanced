package com.telusko.SpringDataJpaProject.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpaProject.model.Vaccine;
import com.telusko.SpringDataJpaProject.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService {
    
	@Autowired
	private IVaccineRepo repo;

	public void setRepo(IVaccineRepo repo) {
		this.repo=repo;
	}

	@Override
	public Vaccine fetchVaccineById(Integer id) {
		
		
		return repo.getReferenceById(id);
	}

	@Override
	public List<Vaccine> fetchByGivenVaccinesInfo(Vaccine vac) {
		
		Example<Vaccine> example=Example.of(vac);
		return repo.findAll(example);
	}

	@Override
	public String removeVaccinesByGivenIds(Iterable<Integer> ids) {
		
		List<Vaccine> vaccines=repo.findAllById(ids);
		if(vaccines.size()!=0) {
			
			repo.deleteAllByIdInBatch(ids);
			return "Vaccines Records Deleted for given ids";
			
		}
		return "Unable to delete records";
	}
	
		
		
	
	
	
	
	
	
	
	

	

}
