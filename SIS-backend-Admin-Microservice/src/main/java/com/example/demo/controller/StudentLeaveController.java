package com.example.demo.controller;

import java.util.List;

//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
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
		
	@GetMapping("/get-leave-applications")
	public List<StudentLeave> getLeaveApplications() {
		return studentLeaveService.getLeaveApplications();
	}
	
	@GetMapping("/get-leave-applications/{id}")
	public StudentLeave getLeaveApplicationById(@PathVariable("id") int id) {
		return studentLeaveService.getLeaveApplicationById(id);
	}
	
	@DeleteMapping("/delete-leave-application/{id}")
	public String deleteLeaveApplication(@PathVariable("id") int id) {
		studentLeaveService.deleteLeaveApplication(id);
		return "Deleted...";
	}
	
	@PatchMapping("/leave-response/{id}")
	public StudentLeave leaveResponse(@PathVariable("id") int id, @RequestBody StudentLeave leave) {
		return studentLeaveService.leaveResponse(leave, id);
	}
	
}
