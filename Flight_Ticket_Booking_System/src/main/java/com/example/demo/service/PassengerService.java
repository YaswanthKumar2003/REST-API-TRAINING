package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Passenger;
import com.example.demo.repo.PassengerRepo;

@Service
public class PassengerService {

	@Autowired
	PassengerRepo pr;
	
	public Passenger saveInfo(Passenger st)
	{
		return pr.save(st);
	}
	public List<Passenger> saveInfoN(List<Passenger> st)
	{
		return pr.saveAll(st);
	}
	public List<Passenger> showInfo()
	{
		return pr.findAll();
	}
	public Optional<Passenger> findbyid(int id)
	{
		return pr.findById(id);
	}
	public Passenger changeInfo(Passenger ss)
	{
		return pr.saveAndFlush(ss);
	}
	public void delete(Passenger ss)
	{
		pr.delete(ss);
	}
	public void deletid(int id)
	{
		pr.deleteById(id);
	}
}
