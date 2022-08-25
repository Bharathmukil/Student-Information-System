package com.example.demo.controller;

//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentQuery;
//import com.example.demo.repository.StudentQueryRepository;
import com.example.demo.service.StudentQueryService;
//import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins= "https://http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class StudentQueryController {
	@Autowired
	private StudentQueryService studentQueryService;
		
	// create employee rest
	@PostMapping("/post-query")
	public StudentQuery postQuery(@RequestBody StudentQuery query) {
		return studentQueryService.postQuery(query);
	}
}
