package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo ur;
	public User saveInfo(User st)
	{
		return ur.save(st);
	}
	public List<User> saveInfoN(List<User> st)
	{
		return ur.saveAll(st);
	}
	public List<User> showInfo()
	{
		return ur.findAll();
	}
	public Optional<User> findbyid(int id)
	{
		return ur.findById(id);
	}
	public User changeInfo(User ss)
	{
		return ur.saveAndFlush(ss);
	}
	public void delete(User ss)
	{
		ur.delete(ss);
	}
	public void deletid(int id)
	{
		ur.deleteById(id);
	}
	
	
}
