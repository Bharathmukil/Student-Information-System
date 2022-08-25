package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.StudentQuery;
import com.example.demo.repository.StudentQueryRepository;
import org.springframework.stereotype.Service;
//import com.example.student.student.model.StudentQuery;
//import com.example.student.student.service.StudentQueryService;
//import java.util.ArrayList;  
//import java.util.List;


@Service
public class StudentQueryImpl implements StudentQueryService {
	@Autowired
	private StudentQueryRepository studentQueryRepository;
	
	@Override
	public List<StudentQuery> getAllQueries() {
		ArrayList<StudentQuery> studentQueries = new ArrayList<StudentQuery>();
		studentQueryRepository.findAll().forEach(studentQuery -> studentQueries.add(studentQuery));
		return studentQueries;
	}
	
	@Override 
	public StudentQuery queryResponse(int id, StudentQuery query) {
		StudentQuery studentQueryDet = studentQueryRepository.findById(id).get();
		studentQueryDet.setResponse(query.getResponse());
		studentQueryDet.setResponded(query.isResponded());
		return studentQueryRepository.save(studentQueryDet);
	}
}
