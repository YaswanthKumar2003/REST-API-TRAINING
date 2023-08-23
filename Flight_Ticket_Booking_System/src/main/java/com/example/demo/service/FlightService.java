package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Flight;
import com.example.demo.repo.FlightRepo;

@Service
public class FlightService {

	@Autowired
	FlightRepo f;
	
	public Flight saveInfo(Flight st)
	{
		return f.save(st);
	}
	public List<Flight> saveInfoN(List<Flight> st)
	{
		return f.saveAll(st);
	}
	public List<Flight> showInfo()
	{
		return f.findAll();
	}
	public Optional<Flight> findbyid(int id)
	{
		return f.findById(id);
	}
	public Flight changeInfo(Flight ss)
	{
		return f.saveAndFlush(ss);
	}
	public void delete(Flight ss)
	{
		f.delete(ss);
	}
	public void deletid(int id)
	{
		f.deleteById(id);
	}
	
	
	
}
