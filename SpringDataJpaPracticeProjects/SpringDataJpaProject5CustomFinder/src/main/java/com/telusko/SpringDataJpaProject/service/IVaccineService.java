package com.telusko.SpringDataJpaProject.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.telusko.SpringDataJpaProject.model.Vaccine;

public interface IVaccineService {

    public List<Vaccine> searchByCost(Double cost); //Is,Equals
	
	public List<Vaccine> searchByCostIs(Double cost);
	
	public List<Vaccine> searchByCostEquals(Double cost);
	
    public List<Vaccine> searchByCostLessThanEqual(Double cost);
	
	public List<Vaccine> searchByCostBetween(Double minCost,Double maxCost);
	
    public List<Vaccine> searchByVaccineCompanyEquals(String cName);
	
	public List<Vaccine> searchByVaccineNameInAndCostBetween(Collection<String> names, Double minCost, Double maxCost);

}
