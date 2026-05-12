package com.telusko.SpringDataJpaProject.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.telusko.SpringDataJpaProject.model.Vaccine;
import com.telusko.SpringDataJpaProject.view.View;

public interface IVaccineService {

	public<T extends View>List<T> searchByCostLessThan(Double cost, Class<T> cls);
	

}
