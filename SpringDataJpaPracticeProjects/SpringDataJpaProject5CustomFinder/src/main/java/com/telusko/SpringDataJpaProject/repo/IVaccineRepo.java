package com.telusko.SpringDataJpaProject.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringDataJpaProject.model.Vaccine;


public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	
	//findBy-PropertyName-keyword
	
	public List<Vaccine> findByCost(Double cost); //Is,Equals
	
	public List<Vaccine> findByCostIs(Double cost);
	
	public List<Vaccine> findByCostEquals(Double cost);
	
	public List<Vaccine> findByCostLessThanEqual(Double cost);
	
	public List<Vaccine> findByCostBetween(Double minCost,Double maxCost);
	
	public List<Vaccine> findByVaccineCompanyEquals(String cName);
	
	public List<Vaccine> findByVaccineNameInAndCostBetween(Collection<String> names, Double minCost, Double maxCost);
}
