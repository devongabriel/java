package com.codingdojo.displaydate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class indexcontroller {
	@RequestMapping("/")
	public String index() {
		return "root.jsp";
	}
}
