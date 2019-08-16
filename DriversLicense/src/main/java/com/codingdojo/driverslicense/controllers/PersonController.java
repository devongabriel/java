package com.codingdojo.driverslicense.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.driverslicense.models.Person;
import com.codingdojo.driverslicense.services.AppService;

@Controller
public class PersonController {

	@Autowired
	AppService appService;
	
	@GetMapping("/persons/new")
	public String newPerson(@ModelAttribute("newPersonObject") Person person) {
		return "persons/new.jsp";
	}
	@PostMapping("/persons/new")
	public String createPerson(@Valid @ModelAttribute("newPersonObject") Person person, BindingResult results) {
		if(results.hasErrors()) {
			return "persons/new.jsp";
		}
		appService.createPerson(person);
		return "redirect:/licenses/new";
	}
	
	@RequestMapping("/persons/{id}")
	public String viewLicense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("license", appService.getLicense(id));
		return "licenses/view.jsp";
	}

	
}
