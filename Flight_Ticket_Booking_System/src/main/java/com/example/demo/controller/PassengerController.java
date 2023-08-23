package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Passenger;
import com.example.demo.service.PassengerService;

@RestController
public class PassengerController {

	
	@Autowired
	PassengerService ps;
	
@PostMapping("addpass")
	
	public Passenger add(@RequestBody  Passenger se)
	{
		return ps.saveInfo(se);
	}
@PostMapping("addnpass")
	public List<Passenger> add(@RequestBody  List<Passenger> se)
	{
		return ps.saveInfoN(se);
	}
	@GetMapping("showpass")
	public List<Passenger> show()
	{
		return ps.showInfo();
	}
	@GetMapping("getpassid/{id}")
	public Optional<Passenger> getid(@PathVariable int id)
	{
		return ps.findbyid(id);
	}
	@PutMapping("updatepass")
	public Passenger modify(@RequestBody Passenger se)
	{
		return ps.changeInfo(se);
	}
	@DeleteMapping("deletepass")
	public String del(@RequestBody Passenger se)
	{
		ps.delete(se);
		return "Deleted Succefsfully";
	}
	@DeleteMapping("deletepassid/{id}")
	public String delId(@PathVariable int id)
	{
		ps.deletid(id);
		return "Deleted Id: "+id;
	}
	
	
	



}
