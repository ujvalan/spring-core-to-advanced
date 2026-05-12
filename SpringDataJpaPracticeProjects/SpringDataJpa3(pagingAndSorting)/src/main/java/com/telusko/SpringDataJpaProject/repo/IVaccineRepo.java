package com.telusko.SpringDataJpaProject.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.telusko.SpringDataJpaProject.model.Vaccine;


public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> {
}
