package com.example.demo.serivicd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeModal;
import com.example.demo.repositrory.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo er;
	
	public EmployeeModal add(EmployeeModal em)
	{
		return er.save(em);
	}
	public List<EmployeeModal> showall()
	{
		return er.findAll();
	}
	
}
