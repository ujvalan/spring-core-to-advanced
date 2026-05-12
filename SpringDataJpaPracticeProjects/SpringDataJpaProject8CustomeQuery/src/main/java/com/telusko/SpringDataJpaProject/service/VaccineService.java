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
	public List<Vaccine> fetchByVaccineCompany(String c) {
		return repo.searchByVaccineCompany(c);
	}

	@Override
	public List<Vaccine> fetchByVaccineCompanies(String comp1, String comp2) {
		return repo.searchByVaccineCompanies(comp1, comp2);
	}

	@Override
	public List<String> searchVaccineNameByCost(Double minPrice, Double maxPrice) {
		// TODO Auto-generated method stub
		return repo.searchVaccineNameByCost(minPrice, maxPrice) ;
	}

	@Override
	public int updateTheCostByVaccineName(Double newCost, String vaccineName) {
		
		return repo.updateCostByVaccineName(newCost, vaccineName);
	}

	@Override
	public int deleteTheVaccineByVaccineName(String vaccineName) {
		
		return repo.deleteVaccineByVaccineName(vaccineName);
	}

	@Override
	public int insertVaccineDetails(Integer id, String vaccineName, String vaccineCompany, Double cost) {
		// TODO Auto-generated method stub
		return repo.insertVaccineInfo(id, vaccineName, vaccineCompany, cost);
	}

	

	

	
	

	
		
		
	
	
	
	
	
	
	
	

	

}
