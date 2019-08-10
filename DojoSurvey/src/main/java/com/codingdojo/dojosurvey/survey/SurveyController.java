package com.codingdojo.dojosurvey.survey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping

public class SurveyController {
	
    @RequestMapping(value="/")
    public String index (Model model) {
    	return "index.jsp";
    }
    
    @RequestMapping(value="/process", method=RequestMethod.POST)
    public String processResult(HttpSession session, 
    		@RequestParam(value="name") String name, 
    		@RequestParam(value="location") String location, 
    		@RequestParam(value="language") String language, 
    		@RequestParam(value="comment") String comment) {
    	
 
		session.setAttribute("name", name);
    	session.setAttribute("location", location);
    	session.setAttribute("language", language);
    	session.setAttribute("comment", comment);
    	return "redirect:/result";
    }
    
    @RequestMapping("/result")
    public String result(Model model, HttpSession session) {
    	String name = (String)session.getAttribute("name");
    	
    	model.addAttribute("name", name);
    	
    	return "results.jsp";
    }
}
