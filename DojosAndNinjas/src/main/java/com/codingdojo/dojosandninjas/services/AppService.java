package com.codingdojo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;
import com.codingdojo.dojosandninjas.repositories.NinjaRepository;

@Service
public class AppService {
	@Autowired
	private DojoRepository	dojoRepository;
	@Autowired
	private NinjaRepository ninjaRepository;

	//	gets all dojos on ninjas/new page
	public List<Dojo> getAllDojos() {
		
		return dojoRepository.findAll();
	}
	//	creates dojo
	public void createDojo(@Valid Dojo dojo) {
		dojoRepository.save(dojo);
	}
	//	creates ninja
	public void createNinja(@Valid Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	public Dojo getOneDojo(Long id) {
		Optional<Dojo> dojo = dojoRepository.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		} else {
		return null;
		}
	}
}
