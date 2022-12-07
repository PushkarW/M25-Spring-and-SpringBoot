package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudenrRepository repo;
	
	public List<Student>listAll()
	{
		return repo.findAll();
	}
	//To Retrieve the Specific record
	public Student retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//To Insert Update
	public void add(Student student)
	{
		repo.save(student);
	}
	//To Delete with Specific Id
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
}
