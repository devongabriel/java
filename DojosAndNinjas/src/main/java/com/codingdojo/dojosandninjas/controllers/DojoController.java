package com.codingdojo.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.services.AppService;

@Controller
public class DojoController {
	@Autowired
	private AppService appService;
	
	@GetMapping("/dojos/new")
	public String dojoNew(@ModelAttribute("newDojoObject") Dojo dojo) {
		return "dojos/new.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("newDojoObject") Dojo dojo, BindingResult results) {
		if(results.hasErrors()) {
			return "dojos/new.jsp";
		}
		appService.createDojo(dojo);
		return "redirect:/ninjas/new";
	}
	
	@GetMapping("/dojos/{id}")
	public String getOneDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = appService.getOneDojo(id);
		model.addAttribute("dojo", dojo);
		return "dojos/view.jsp";
	}
	
}
