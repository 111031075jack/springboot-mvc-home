package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class ApiController {
	
	@GetMapping("/api/hello")
	public String hello() {
		return "Hello Springboot";
	}
	
}
