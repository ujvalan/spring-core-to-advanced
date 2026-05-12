package com.telusko.SpringDataJpaProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringDataJpaProject.model.Vaccine;


public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	
	
	
}
