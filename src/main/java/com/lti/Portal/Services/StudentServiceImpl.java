package com.lti.Portal.Services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.Portal.DAO.StudentDAO;
import com.lti.Portal.pojo.StudentLoginPojo;

@Service
@Transactional
public class StudentServiceImpl implements StudentServices
{
	@Autowired
	StudentDAO student;
	
	@Override
	public List<StudentLoginPojo>getStudents() 
	{
		// TODO Auto-generated method stub
		return student.getStudent();
	}
	@Override
	public boolean addStudent(StudentLoginPojo Student) {
		// TODO Auto-generated method stub
		return student.addStudent(Student);
	}
	@Override
	public boolean validateLogin(String Email,String password)
	{
		return student.validateLogin(Email,password);
	}
}
