package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	//RESTFULLAPI method for retrieval operation
	//to retrieve all the data
	@GetMapping("/student")
	public List<Student>list()
	{
		return service.listAll();
	}
	//to retrieve with specific record
	@GetMapping("/student/{id}")
	public ResponseEntity<Student>get(@PathVariable Integer id)
	{
		try {
		Student student=service.retrieve(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	//To insert a data
	@PostMapping("/student")
	public void insert(@RequestBody Student student)
	{
		service.add(student);
	}
	//to Delete with specific record
	@DeleteMapping("/student/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	//To update a data
	@PutMapping("/student/{id}")
	public ResponseEntity<?>update(@RequestBody Student student,@PathVariable Integer id)
	{
		try {
		Student student1=service.retrieve(id);
		service.add(student);
		return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
