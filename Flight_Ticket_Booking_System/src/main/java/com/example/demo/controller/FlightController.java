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

import com.example.demo.model.Flight;
import com.example.demo.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	FlightService fs;
	
@PostMapping("addflight")
	
	public Flight add(@RequestBody  Flight se)
	{
		return fs.saveInfo(se);
	}
@PostMapping("addnflight")
	public List<Flight> add(@RequestBody  List<Flight> se)
	{
		return fs.saveInfoN(se);
	}
	@GetMapping("showflight")
	public List<Flight> show()
	{
		return fs.showInfo();
	}
	@GetMapping("getflightid/{id}")
	public Optional<Flight> getid(@PathVariable int id)
	{
		return fs.findbyid(id);
	}
	@PutMapping("updateflight")
	public Flight modify(@RequestBody Flight se)
	{
		return fs.changeInfo(se);
	}
	@DeleteMapping("deleteflight")
	public String del(@RequestBody Flight se)
	{
		fs.delete(se);
		return "Deleted Succefsfully";
	}
	@DeleteMapping("deleteflightid/{id}")
	public String delId(@PathVariable int id)
	{
		fs.deletid(id);
		return "Deleted Id: "+id;
	}
	
	
	

}
