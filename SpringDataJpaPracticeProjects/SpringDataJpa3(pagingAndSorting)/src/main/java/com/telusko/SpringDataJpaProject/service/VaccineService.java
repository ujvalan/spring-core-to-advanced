package com.telusko.SpringDataJpaProject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpaProject.model.Vaccine;
import com.telusko.SpringDataJpaProject.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService {
    
	@Autowired
	private IVaccineRepo repo;

	@Override
	public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... properties) {

				Sort sort=Sort.by(status?Direction.ASC:Direction.DESC,properties);
				return repo.findAll(sort);

	}

	@Override
	public Iterable<Vaccine> fetchVaccineInfoByPagination(int pgNo, int pgSize, Boolean status, String... properties) {

//		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC,properties);
//		PageRequest.of(pgNo, pgSize, sort);
		
		PageRequest pageable = PageRequest.of(pgNo, pgSize,status?Direction.ASC:Direction.DESC, properties);
		
		Page<Vaccine> page= repo.findAll(pageable);
		
		return  page.getContent();
	}

	@Override
	public void fetchVaccineInfoByPagination(int pgSize) 
	{
		long count=12l;
		long pageCount=count/pgSize; // ===> 12/3 ==> 4
		// ==>14/5 ===>2.8
		pageCount=count%pgSize==0?pageCount:++pageCount;
		for(int i=0;i<pageCount;i++) {
			
			PageRequest pageable = PageRequest.of(i, pgSize);
			Page<Vaccine> page = repo.findAll(pageable);
			page.getContent().forEach(v->System.out.println(v));
			System.out.println("***************************************");
		}
		
		
	}
	
	
	
	
	
	
	

	

}
