package com.telusko.SpringDataJpaProject.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telusko.SpringDataJpaProject.model.Vaccine;


public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {
// customFinder and custom query methods
}
