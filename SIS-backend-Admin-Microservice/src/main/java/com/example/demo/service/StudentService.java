package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Student;


public interface StudentService {
	List<Student> getAllStudents();
	Student createStudent(Student student);
	Student getStudentById(int id);
	Student updateStudent(Student student,int id);
	void deleteStudent(int id);
}
