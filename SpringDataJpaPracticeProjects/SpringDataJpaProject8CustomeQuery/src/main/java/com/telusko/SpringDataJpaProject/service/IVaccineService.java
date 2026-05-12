package com.telusko.SpringDataJpaProject.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.telusko.SpringDataJpaProject.model.Vaccine;

public interface IVaccineService {

	public List<Vaccine> fetchByVaccineCompany(@Param("company")String c);
	
	public List<Vaccine> fetchByVaccineCompanies(String comp1,String comp2);

	public List<String> searchVaccineNameByCost(Double minPrice,Double maxPrice);//@Param() is not mandatory here

    public int updateTheCostByVaccineName(Double newCost,String vaccineName);
    
    public int deleteTheVaccineByVaccineName(String vaccineName);

    public int insertVaccineDetails(Integer id, String vaccineName,String vaccineCompany,Double cost);
}
