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

import com.example.demo.model.User;

import com.example.demo.service.UserService;

@RestController
public class UserController {


	
	@Autowired
	UserService ps;
	
@PostMapping("adduser")
	
	public User add(@RequestBody  User se)
	{
		return ps.saveInfo(se);
	}
@PostMapping("addnuser")
	public List<User> add(@RequestBody  List<User> se)
	{
		return ps.saveInfoN(se);
	}
	@GetMapping("showuser")
	public List<User> show()
	{
		return ps.showInfo();
	}
	@GetMapping("getuserid/{id}")
	public Optional<User> getid(@PathVariable int id)
	{
		return ps.findbyid(id);
	}
	@PutMapping("updateuser")
	public User modify(@RequestBody User se)
	{
		return ps.changeInfo(se);
	}
	@DeleteMapping("deleteuser")
	public String del(@RequestBody User se)
	{
		ps.delete(se);
		return "Deleted Succefsfully";
	}
	@DeleteMapping("deleteuserid/{id}")
	public String delId(@PathVariable int id)
	{
		ps.deletid(id);
		return "Deleted Id: "+id;
	}
	
	
	




	

}
