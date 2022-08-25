package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}




