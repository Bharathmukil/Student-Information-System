package com.example.demo.service;

import java.util.Arrays;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StudentService {
	
	@Value("${api.studentById}")
	String studentUrlById;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ObjectMapper objectMapper;
	
	public Student studentRecord(int studentId) {
		
		// step to communicate
		// 1. Set uri variable
		HashMap<String, Integer> uriVariable = new HashMap<String, Integer>();
		uriVariable.put("studentId", studentId);
		
		// 2. Set headers
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		// 3. Set Entity
		HttpEntity<String> entity = new HttpEntity<String>(header);
		
		// 4. making call to another microservice
		ResponseEntity<String> exchange = restTemplate.exchange(this.studentUrlById, HttpMethod.GET, entity, String.class, uriVariable);
		String body = exchange.getBody();
		
		// 5. Parse data from JSON string
		Student readValue = null;
		try {
			readValue = objectMapper.readValue(body, Student.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return readValue;
		
	}

}
