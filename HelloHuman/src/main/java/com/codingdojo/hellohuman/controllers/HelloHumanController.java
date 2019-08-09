package com.codingdojo.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloHumanController {
	 @RequestMapping("/")
	 public String home(@RequestParam(value="first_name", required=false) String first_name, @RequestParam(value="last_name", required=false) String last_name){
		 if (first_name == null && last_name == null){
			 first_name = "Human";
		 }
		 if (last_name == null){
			 last_name = "";
		 }
		 
		 if (first_name == null) {
			 first_name = "";
		 }
		 return "<h3> Hello " + first_name + last_name + "</h3> <p> Welcome to SpringBoot </p> <a href='/'> Back </a>";
	 }
	 
	}
