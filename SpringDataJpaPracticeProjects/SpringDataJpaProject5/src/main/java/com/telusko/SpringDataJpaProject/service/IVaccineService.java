package com.telusko.SpringDataJpaProject.service;

import java.util.List;
import java.util.Optional;

import com.telusko.SpringDataJpaProject.model.Vaccine;

public interface IVaccineService {

	Vaccine fetchVaccineById(Integer id);
	List<Vaccine> fetchByGivenVaccinesInfo(Vaccine vac);
	String removeVaccinesByGivenIds(Iterable<Integer> ids);
	
}
