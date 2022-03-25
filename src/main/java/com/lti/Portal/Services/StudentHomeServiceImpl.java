package com.lti.Portal.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.lti.Portal.DAO.StudentHomeDAO;
import com.lti.Portal.pojo.StudentHome;

@Service
@Transactional
public class StudentHomeServiceImpl implements StudentHomeService
{
	@Autowired
	StudentHomeDAO student;

	@Override
	public boolean addStudentHome(StudentHome Student) {
		// TODO Auto-generated method stub
		return student.addStudentHome(Student);
	}

	@Override
	public List<StudentHome> getStudentHomes() {
		// TODO Auto-generated method stub
		return student.getStudentHome();
	}
	public StudentHome validateUser(String Email)
	{
		return student.validateUser(Email);
	}
	
}
