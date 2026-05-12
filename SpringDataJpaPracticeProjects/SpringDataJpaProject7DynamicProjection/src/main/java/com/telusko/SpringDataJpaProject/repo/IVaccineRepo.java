package com.telusko.SpringDataJpaProject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringDataJpaProject.model.Vaccine;
import com.telusko.SpringDataJpaProject.view.View;


public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	
	//findBy-PropertyName-keyword
	
	public<T extends View>List<T> findByCostLessThan(Double cost, Class<T> cls);
	
	

}
