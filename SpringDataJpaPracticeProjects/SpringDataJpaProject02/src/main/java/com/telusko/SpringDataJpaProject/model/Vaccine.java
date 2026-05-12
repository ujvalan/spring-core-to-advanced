package com.telusko.SpringDataJpaProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String VaccineName;
	
	private String vaccineCompany;
	
	private Double cost;
	

	public Vaccine() {
		super();
	}

	public Vaccine( String vaccineName, String vaccineCompany, Double cost) {
		super();
		VaccineName = vaccineName;
		this.vaccineCompany = vaccineCompany;
		this.cost = cost;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVaccineName() {
		return VaccineName;
	}

	public void setVaccineName(String vaccineName) {
		VaccineName = vaccineName;
	}

	public String getVaccineCompany() {
		return vaccineCompany;
	}

	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", VaccineName=" + VaccineName + ", vaccineCompany=" + vaccineCompany + ", cost="
				+ cost + "]";
	}
	
	
	
	

}
