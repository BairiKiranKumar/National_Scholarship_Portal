package com.lti.Portal.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.lti.Portal.pojo.StudentLoginPojo;

public interface StudentServices 
{
	public boolean addStudent(StudentLoginPojo Student);
	public List<StudentLoginPojo> getStudents();
	public boolean validateLogin(String Email,String password);
}
