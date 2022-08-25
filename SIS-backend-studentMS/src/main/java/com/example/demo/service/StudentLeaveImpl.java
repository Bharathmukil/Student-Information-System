package com.example.demo.service;

//import java.util.ArrayList;  
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.StudentLeave;
import com.example.demo.repository.StudentLeaveRepository;
import org.springframework.stereotype.Service;
//import com.example.student.student.model.StudentQuery;
//import com.example.student.student.service.StudentQueryService;


@Service
public class StudentLeaveImpl implements StudentLeaveService {
	@Autowired
	private StudentLeaveRepository studentLeaveRepository;
	
	@Override
	public StudentLeave applyLeave(StudentLeave leave) {
		return studentLeaveRepository.save(leave);
	}
}
