package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.demo.exception.ResourceNotException;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	// get all employees
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
		
	// create employee rest
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	// get employee by id rest api
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}
	
	// update employee rest api
	
	@PutMapping("/students/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") int id){
		 return studentService.updateStudent(student,id);
	}
	
	/*
	public Add_Student updateStudent(@PathVariable int roll_no){
		return studentService.updateStudent(roll_no);
	}*/
	
	@DeleteMapping("/students/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
		return "Deleted!!!";
	}
	
					
				
}
	