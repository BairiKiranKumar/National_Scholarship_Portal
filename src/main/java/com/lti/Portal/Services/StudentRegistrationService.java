package com.lti.Portal.Services;

import java.util.List;

import com.lti.Portal.pojo.StudentRegistrationPojo;

public interface StudentRegistrationService
{
	public boolean addStudentregistration(StudentRegistrationPojo Student);
	public List<StudentRegistrationPojo>getStudentregistrations();
}
