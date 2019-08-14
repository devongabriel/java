package com.codingdojo.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;

@Controller
public class LanguageController {
	@Autowired
	LanguageService languageService;
	
	@GetMapping("/")
	public String home(Model model) {
		List<Language> allLanguages = languageService.getAllLanguages();
		model.addAttribute("Languages", allLanguages);
		return "languages/index.jsp";
	}
	
	@GetMapping("/new")
	public String newLanguage(Model model) {
		model.addAttribute("newLanguageObject", new Language());
		return "languages/new.jsp";
	}
	@PostMapping("/languages")
	public String createLanguage(@Valid @ModelAttribute ("newLanguageObject") Language language, BindingResult results) {
		if (results.hasErrors()) {
			return "languages/new.jsp";
		}
		languageService.createOrUpdateLanguage(language);
		return "redirect:/";
	}
	@GetMapping("/languages/{language_id}/show")
		public String show(@PathVariable("language_id") Long id, Model model) {
		Language language = languageService.getOneLanguage(id);
		model.addAttribute("Language", language);
		return "languages/show.jsp";
	}
	@GetMapping("/languages/{language_id}/update")
	public String editLanguage(Model model, @PathVariable("language_id") Long id) {
		Language language = languageService.getOneLanguage(id);
		model.addAttribute("editLanguageObject", language);
		return "languages/edit.jsp";
	}
	
	@PutMapping("/languages/{id}")
	public String updateLanguage(@Valid @ModelAttribute("editLanguageObject") Language language, BindingResult results) {
		if (results.hasErrors()) {
			return "languages/edit.jsp";
		}
		
		languageService.createOrUpdateLanguage(language);
		return "redirect:/";
	}
}
