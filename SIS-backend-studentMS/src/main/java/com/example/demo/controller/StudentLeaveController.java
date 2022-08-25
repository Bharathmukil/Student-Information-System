package com.example.demo.controller;

//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentLeave;
//import com.example.demo.repository.StudentLeaveRepository;
import com.example.demo.service.StudentLeaveService;
//import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins= "https://http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class StudentLeaveController {
	@Autowired
	private StudentLeaveService studentLeaveService;
		
	// create employee rest
	@PostMapping("/apply-leave")
	public StudentLeave applyLeave(@RequestBody StudentLeave leave) {
		return studentLeaveService.applyLeave(leave);
	}
}
