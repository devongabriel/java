package com.codingdojo.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.AppService;

@Controller
public class NinjaController {
	
	@Autowired
	private AppService appService;
	
	@GetMapping("/ninjas/new")
	public String newNinja(Model model, @ModelAttribute("newNinjaObject") Ninja ninja) {
		List<Dojo> Dojos = appService.getAllDojos();
		model.addAttribute("Dojos", Dojos);
		
		System.out.println(Dojos.get(0).getName());
		return "ninjas/new.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("newNinjaObject") Ninja ninja, BindingResult results) {
		if(results.hasErrors()) {
			return "ninjas/new.jsp";
		}
		appService.createNinja(ninja);
		return "redirect:/ninjas/new";
	}
	
}
