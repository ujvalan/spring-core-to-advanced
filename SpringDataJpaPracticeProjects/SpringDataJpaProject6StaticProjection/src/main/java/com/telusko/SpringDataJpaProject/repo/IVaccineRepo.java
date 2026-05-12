package com.telusko.SpringDataJpaProject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringDataJpaProject.model.Vaccine;
import com.telusko.SpringDataJpaProject.view.ResultView;


public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	
	//findBy-PropertyName-keyword
	
	List<ResultView> findByCostLessThan(Double cost);
	

}
