package com.example.demo.service;

//import java.util.ArrayList;  
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.StudentQuery;
import com.example.demo.repository.StudentQueryRepository;
import org.springframework.stereotype.Service;
//import com.example.student.student.model.StudentQuery;
//import com.example.student.student.service.StudentQueryService;


@Service
public class StudentQueryImpl implements StudentQueryService {
	@Autowired
	private StudentQueryRepository studentQueryRepository;
	
	@Override
	public StudentQuery postQuery(StudentQuery query) {
		return studentQueryRepository.save(query);
	}
}
