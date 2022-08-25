package com.example.demo.service;
import java.util.List;

import com.example.demo.model.StudentQuery;


public interface StudentQueryService {
	List<StudentQuery> getAllQueries();
	StudentQuery queryResponse(int id, StudentQuery query);
}
