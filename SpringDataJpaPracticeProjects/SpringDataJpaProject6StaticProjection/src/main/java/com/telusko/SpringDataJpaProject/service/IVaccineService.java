package com.telusko.SpringDataJpaProject.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.telusko.SpringDataJpaProject.model.Vaccine;
import com.telusko.SpringDataJpaProject.view.ResultView;

public interface IVaccineService {

	List<ResultView> searchByCostLessThan(Double cost);
	
}
