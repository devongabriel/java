package com.codingdojo.driverslicense.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.driverslicense.models.License;
import com.codingdojo.driverslicense.models.Person;
import com.codingdojo.driverslicense.repositories.LicenseRepository;
import com.codingdojo.driverslicense.repositories.PersonRepository;

@Service
public class AppService {
	
	@Autowired
	static
	PersonRepository personRepository;
	@Autowired
	LicenseRepository licenseRepository;

	public void createPerson(@Valid Person person) {
		personRepository.save(person);
	}

	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}

	public void createLicense(License license) {
		licenseRepository.save(license);
	}
	
	public static int licenseNumber;
	
	public String stringLicenseNumber(int num) {
		String format = String.format("%06d", num);
		return format;
	}
	
	public static void setLicenseNumber(int licenseNumber) {
		AppService.licenseNumber = licenseNumber;
	}
	
	public String generateLicenseNumber() {
		if(licenseRepository.findTopByOrderByNumberDesc().isEmpty()) {
			licenseNumber +=1;
			return stringLicenseNumber(licenseNumber);
		}
		else {
			List<License> top = licenseRepository.findTopByOrderByNumberDesc() ;
			licenseNumber = 1+(Integer.parseInt(top.get(0).getNumber()));
			return stringLicenseNumber(licenseNumber);
		}
	}

	public License getLicense(Long id) {
		Optional<License> license = licenseRepository.findById(id);
		return license.get();
	}
}
