package com.lti.Portal.DAO;

import java.util.List;
import com.lti.Portal.pojo.StudentRegistrationPojo;
public interface StudentRegistrationDAO 
{
	public boolean addStudentregistration(StudentRegistrationPojo Student);
	public List<StudentRegistrationPojo>getStudentregistration();
}
