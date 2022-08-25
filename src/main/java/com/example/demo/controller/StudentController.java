package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> studentRecord(@PathVariable("id") int studentId){
		
		Student studentRecord = studentService.studentRecord(studentId);
		return new ResponseEntity<>(studentRecord, HttpStatus.OK);
		
	}
	
}
