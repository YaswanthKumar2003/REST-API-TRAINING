package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@Value("${var}")
	private String name;
	@Value("${color}")
	private String color;
	
	@GetMapping("/welcome")
	public String Welcome()
	{
		return "Welcome Spring Boot";
	}
	@GetMapping("/")
	public String getName()
	{
		return "Welcome "+name+"!";
	}
	@GetMapping("/color")
	public String getMyFav()
	{
		return "My favorite color is "+color;
	}

}
