package com.java.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")

    public String hello() {
            return "Welcome to Spring Boot, friend!";
    }
	@RequestMapping("/random")
	
	public String response() {
		return "Spring boot is so fun! ";
	}

}
