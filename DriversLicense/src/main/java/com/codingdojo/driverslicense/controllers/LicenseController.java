package com.codingdojo.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.driverslicense.models.License;
import com.codingdojo.driverslicense.models.Person;
import com.codingdojo.driverslicense.services.AppService;

@Controller
public class LicenseController {
	
	@Autowired
	AppService appService;

	@GetMapping("/licenses/new")
	public String newLicense(Model model, @ModelAttribute("newLicenseObject") License license) {
		List<Person> Persons = appService.getAllPerson();
		model.addAttribute("Persons", Persons);
		
		System.out.println(Persons.get(0).getFirst_name());
		return "licenses/new.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String createLicense(@Valid @ModelAttribute("newLicenseObject") License license, BindingResult results) {
		if(results.hasErrors()) {
			return "licenses/new.jsp";
		} else {
			String number = appService.generateLicenseNumber();
			license.setNumber(number);
			appService.createLicense(license);
			return "redirect:/licenses/new";
		}
		
	}
}
