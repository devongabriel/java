package com.codingdojo.lookify.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.lookify.service.SongService;

@Controller
public class SongController {
	@Autowired
	SongService songService;
	
	@GetMapping("/")
	public String home() {
		return "/index.html";
	}
}
