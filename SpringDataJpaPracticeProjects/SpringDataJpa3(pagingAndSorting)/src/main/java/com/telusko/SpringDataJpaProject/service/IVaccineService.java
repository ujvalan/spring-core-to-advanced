package com.telusko.SpringDataJpaProject.service;

import java.util.List;
import java.util.Optional;

import com.telusko.SpringDataJpaProject.model.Vaccine;

public interface IVaccineService {
	Iterable<Vaccine> fetchDetailsBySorting(boolean status,String...properties);
	
	Iterable<Vaccine> fetchVaccineInfoByPagination(int pgNo, int pgSize,Boolean status,String...properties);
	
	void fetchVaccineInfoByPagination(int pgSize);
 }
