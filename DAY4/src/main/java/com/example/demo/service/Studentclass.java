package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentEntity;
import com.example.demo.repository.Studentrepo;

@Service
public class Studentclass {
	
	@Autowired
	Studentrepo sr;
	public StudentEntity saveInfo(StudentEntity st)
	{
		return sr.save(st);
	}
	public List<StudentEntity> saveInfoN(List<StudentEntity> st)
	{
		return sr.saveAll(st);
	}
	public List<StudentEntity> showInfo()
	{
		return sr.findAll();
	}
	public StudentEntity changeInfo(StudentEntity ss)
	{
		return sr.saveAndFlush(ss);
	}
	public void delete(StudentEntity ss)
	{
		sr.delete(ss);
	}
	public void deletid(int id)
	{
		sr.deleteById(id);
	}
	public void deletename(int id)
	{
		sr.deleteById(id);
	}
}
