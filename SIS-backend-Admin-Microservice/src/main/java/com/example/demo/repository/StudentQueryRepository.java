package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.StudentQuery;
//import com.example.student.student.model.StudentLeave;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentQueryRepository extends JpaRepository<StudentQuery, Integer>{

}

