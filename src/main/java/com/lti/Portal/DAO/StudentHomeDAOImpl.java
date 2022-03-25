package com.lti.Portal.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.lti.Portal.Controller.StudentController;
import com.lti.Portal.pojo.StudentHome;


@Repository
public class StudentHomeDAOImpl implements StudentHomeDAO
{
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addStudentHome(StudentHome Student) {
		// TODO Auto-generated method stub
		 eMan.persist(Student);
		 return true;
	}

	@Override
	public List<StudentHome> getStudentHome() {
		// TODO Auto-generated method stub
		return eMan.createQuery("From StudentHome").getResultList();
	}
	@Override
	public StudentHome validateUser(String Email)
	{
		StudentHome obj=eMan.find(StudentHome.class,Email);
		return obj;	
	}
	/*@Override
	public boolean validate(double tenthper, double twelper, String scheme, String Girlscheme, String community) {
		// TODO Auto-generated method stub
		if(tenthper<=55 && twelper<=55 && community==("ST","SC","PG","Other") && scheme!=null && Girlscheme==null)
		{
			
		}
		else
		{
		return false;
		}
	}*/
	
}
