package com.codingdojo.languages.services;

import java.util.List;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	LanguageRepository languageRepository;

	//lists all languages
	public List<Language> getAllLanguages() {
		return languageRepository.findAll();
	}
	
	//creates new language
	public void createOrUpdateLanguage(@Valid Language language) {
		languageRepository.save(language);
	}

	public Language getOneLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}

	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}
	
}
