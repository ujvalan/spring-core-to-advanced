package com.telusko.SpringDataJpaProject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.telusko.SpringDataJpaProject.model.Vaccine;


public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	
//	@Query("FROM Vaccine WHERE vaccineComapny=:company")
//	public List<Vaccine> searchByVaccineCompany(String company);

	@Query("FROM Vaccine WHERE vaccineCompany=:company")
	public List<Vaccine> searchByVaccineCompany(@Param("company")String c);// @Param() is mandatory here

	@Query("From Vaccine WHERE vaccineCompany IN (:comp1,:comp2)")
	public List<Vaccine> searchByVaccineCompanies(String comp1,String comp2);//@Param() is not mandatory here
	
	@Query("SELECT vaccineName FROM Vaccine where cost BETWEEN :minPrice and :maxPrice")
	public List<String> searchVaccineNameByCost(Double minPrice,Double maxPrice);//@Param() is not mandatory here

//	@Transactional
//	@Modifying
//	@Query("UPDATE Vaccine SET cost=:newCost WHERE vaccineName=:vaccineName")
//	public int updateCostByVaccineName(Double newCost,String vaccineName);
	
	@Transactional
	@Query("Update Vaccine Set cost=:newCost where vaccineName=:vaccineName")
	public int updateCostByVaccineName(Double newCost,String vaccineName);
	@Transactional
	@Modifying
	@Query("Delete FROM Vaccine WHERE vaccineName=:vaccineName")
	public int deleteVaccineByVaccineName(String vaccineName);

	@Transactional//
	@Modifying
	@Query(value="INSERT INTO vaccine(`id` ,`vaccine_name`,`vaccine_company`,`cost`) Values(?,?,?,?)",nativeQuery=true)
	//its a native sql queyr
	public int insertVaccineInfo(Integer id,String vaccineName, String vaccineCompany, Double cost);



}
