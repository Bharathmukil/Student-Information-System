package com.example.demo.service;

import com.example.demo.model.StudentLeave;
import java.util.List;

public interface StudentLeaveService {
	void deleteLeaveApplication(int id);
	List<StudentLeave> getLeaveApplications();
	StudentLeave leaveResponse(StudentLeave leave, int id);
	StudentLeave getLeaveApplicationById(int id);
}
