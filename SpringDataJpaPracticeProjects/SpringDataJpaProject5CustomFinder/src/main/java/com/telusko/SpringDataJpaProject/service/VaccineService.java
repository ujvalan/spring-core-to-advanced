package com.telusko.SpringDataJpaProject.service;


import java.util.Collection;
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
	public List<Vaccine> searchByCost(Double cost) {
		
		return repo.findByCost(cost);
	}

	@Override
	public List<Vaccine> searchByCostIs(Double cost) {
		
		return repo.findByCostIs(cost);
	}

	@Override
	public List<Vaccine> searchByCostEquals(Double cost) {
		
		return repo.findByCostEquals(cost);
	}

	@Override
	public List<Vaccine> searchByCostLessThanEqual(Double cost) {
		
		return repo.findByCostLessThanEqual(cost);
	}

	@Override
	public List<Vaccine> searchByCostBetween(Double minCost, Double maxCost) {
		
		return repo.findByCostBetween(minCost, maxCost);
	}

	@Override
	public List<Vaccine> searchByVaccineCompanyEquals(String cName) {
		
		return repo.findByVaccineCompanyEquals(cName);
	}

	@Override
	public List<Vaccine> searchByVaccineNameInAndCostBetween(Collection<String> names, Double minCost, Double maxCost) {
		
		return repo.findByVaccineNameInAndCostBetween(names, minCost, maxCost);
	}

	
	
		
		
	
	
	
	
	
	
	
	

	

}
