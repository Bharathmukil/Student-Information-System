package com.example.demo.service;

import java.util.ArrayList;
//import java.util.ArrayList;  
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.StudentLeave;
import com.example.demo.repository.StudentLeaveRepository;
import com.example.demo.repository.StudentRepository;

import org.springframework.stereotype.Service;
//import com.example.student.student.model.StudentQuery;
//import com.example.student.student.service.StudentQueryService;


@Service
public class StudentLeaveImpl implements StudentLeaveService {
	@Autowired
	private StudentLeaveRepository studentLeaveRepository;
	
	@Override
	public void deleteLeaveApplication(int id) {
		studentLeaveRepository.deleteById(id);
	}
	
	@Override
	public List<StudentLeave> getLeaveApplications() {
		ArrayList<StudentLeave> studentLeaves = new ArrayList<StudentLeave>();
		studentLeaveRepository.findAll().forEach(studentLeave -> studentLeaves.add(studentLeave));
		return studentLeaves;
	}
	
	@Override
	public StudentLeave leaveResponse(StudentLeave leave, int id) {
		StudentLeave studentLeaveDet = studentLeaveRepository.findById(id).get();
		studentLeaveDet.setResponse(leave.isResponse());
		studentLeaveDet.setResponded(true);
		return studentLeaveRepository.save(studentLeaveDet);
	}
	
	@Override
	public StudentLeave getLeaveApplicationById(int id) {
		return studentLeaveRepository.findById(id).get();
	}
}
