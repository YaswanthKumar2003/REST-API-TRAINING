package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentEntity;
import com.example.demo.service.Studentclass;

@RestController
public class Studentcontroller {
	
	@Autowired
	Studentclass ss;
	
	@PostMapping("addstudent")
	
	public StudentEntity add(@RequestBody  StudentEntity se)
	{
		return ss.saveInfo(se);
	}
@PostMapping("addnstudent")
	
	public List<StudentEntity> add(@RequestBody  List<StudentEntity> se)
	{
		return ss.saveInfoN(se);
	}
	@GetMapping("showstudent")
	public List<StudentEntity> show()
	{
		return ss.showInfo();
	}
	@PutMapping("update")
	public StudentEntity modify(@RequestBody StudentEntity se)
	{
		return ss.changeInfo(se);
	}
	@DeleteMapping("delete")
	public String del(@RequestBody StudentEntity se)
	{
		ss.delete(se);
		return "Deleted Successfully";
	}
	@DeleteMapping("deleteid/{id}")
	public void delId(@PathVariable int id)
	{
		ss.deletid(id);
	}
	
	@DeleteMapping("deletename/")
	public void delparam(@RequestBody int id)
	{
		ss.deletename(id);
	}

}
