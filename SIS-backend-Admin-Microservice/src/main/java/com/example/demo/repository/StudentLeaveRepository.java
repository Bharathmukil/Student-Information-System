package com.example.demo.repository;
import org.springframework.stereotype.Repository;
//import com.example.student.student.model.StudentQuery;
import com.example.demo.model.StudentLeave;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentLeaveRepository extends JpaRepository<StudentLeave, Integer>{

}

