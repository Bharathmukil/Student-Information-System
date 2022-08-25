package com.example.demo.service;

import java.util.ArrayList;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;
//import com.example.springbackend.service.StudentService;



@Service
public class StudentServiceImpl implements StudentService {
		
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		ArrayList<Student> student = new ArrayList<Student>();
		studentRepository.findAll().forEach(student1 -> student.add(student1));
		return student;
	}
	
	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}
	
	@Override
	public Student updateStudent(Student student,int id) {
		Student studentDet= studentRepository.findById(id).get();
            studentDet.setCls(student.getCls());
            studentDet.setFirst_name(student.getFirst_name());
            studentDet.setLast_name(student.getLast_name());
            studentDet.setGender(student.getGender());
            studentDet.setAge(student.getAge());
            studentDet.setAddress(student.getAddress());
            studentDet.setEmail(student.getEmail());
      
            return studentRepository.save(studentDet);

			
			//return new Add_Student(updatedStudent.getName(),updatedStudent.getCls(),updatedStudent.getGender(),updatedStudent.getDob());
	}
	
	@Override
	public void deleteStudent(int id) {
		//	Add_Student student = studentRepository.findById(no).get();
			studentRepository.deleteById(id);
	}
	
	
	

	
		
}
