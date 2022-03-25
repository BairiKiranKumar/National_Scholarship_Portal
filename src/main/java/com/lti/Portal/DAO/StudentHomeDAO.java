package com.lti.Portal.DAO;

import java.util.List;

import com.lti.Portal.pojo.StudentHome;

public interface StudentHomeDAO 
{
	public boolean addStudentHome(StudentHome Student);
	public List<StudentHome>getStudentHome();
	public StudentHome validateUser(String Email);
	//public boolean validate( double tenthper, double twelper,String scheme, String Girlscheme,String community);
	
}
