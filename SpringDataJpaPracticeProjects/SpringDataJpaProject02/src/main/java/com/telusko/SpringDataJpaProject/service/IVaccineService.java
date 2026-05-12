package com.telusko.SpringDataJpaProject.service;

import java.util.List;
import java.util.Optional;

import com.telusko.SpringDataJpaProject.model.Vaccine;

public interface IVaccineService {
	String registerVaccineDetails(Vaccine vaccine);
	Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
    Long count();
    
    Boolean checkAvailability(Integer id);
    Iterable<Vaccine> fetchAllVaccines();
    Iterable<Vaccine> fetchAllVaccinesByIds(Iterable<Integer> ids);
    Optional<Vaccine> fetchVaccineById(Integer id);
    String removeVaccineById(Integer id);
    String removeVaccineByObj(Vaccine obj);
    String removeVaccineByIds(List<Integer> ids);
 }
