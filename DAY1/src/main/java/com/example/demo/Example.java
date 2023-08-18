package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
	
	@GetMapping("list")
	public String display()
	{
		return "Hello";
	}

}
