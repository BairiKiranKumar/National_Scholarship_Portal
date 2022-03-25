package com.lti.Portal.Services;

import java.util.List;

import com.lti.Portal.pojo.StudentHome;

public interface StudentHomeService 
{
	public boolean addStudentHome(StudentHome Student);
	public List<StudentHome>getStudentHomes();
	public StudentHome validateUser(String Email);
}
