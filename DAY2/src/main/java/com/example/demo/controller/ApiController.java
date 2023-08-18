package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@Value("${var}")
	public String name;
	
	@GetMapping("variable")
	public String display()
	{
		return "Hello "+name;
	}
}
