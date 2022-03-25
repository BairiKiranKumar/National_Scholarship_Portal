package com.lti.Portal.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Portal.DAO.StudentRegistrationDAO;
import com.lti.Portal.pojo.StudentRegistrationPojo;
@Service
@Transactional
public class StudentRegistrationServiceImpl implements StudentRegistrationService
{
	@Autowired
	StudentRegistrationDAO student;
	@Override
	public List<StudentRegistrationPojo>getStudentregistrations()
	{
		return student.getStudentregistration();
	}
	@Override
	public boolean addStudentregistration(StudentRegistrationPojo Student)
	{
		return student.addStudentregistration(Student);
	}
}
