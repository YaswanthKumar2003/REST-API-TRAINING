package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeModal;
import com.example.demo.serivicd.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@PostMapping("addemp")
	public EmployeeModal add(@RequestBody  EmployeeModal se)
	{
		return es.add(se);
	}
	@GetMapping("showemp")
	public List<EmployeeModal> show()
	{
		return es.showall();
	}
}
