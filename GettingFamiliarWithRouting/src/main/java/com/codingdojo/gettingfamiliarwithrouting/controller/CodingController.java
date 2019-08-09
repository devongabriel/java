package com.codingdojo.gettingfamiliarwithrouting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class CodingController {
	@RequestMapping("/coding")
    public String coding(){
      return "Welcome to Coding Dojo!";
    }
	@RequestMapping("/python")
	public String python(){
	return "Python/Django was awesome!";
	}
	@RequestMapping("/java")
	public String java(){
	return "Java/Spring is better!";
	}
}


