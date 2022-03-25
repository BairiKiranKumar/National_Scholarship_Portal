package com.lti.Portal.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.lti.Portal.pojo.StudentHome;
import com.lti.Portal.pojo.StudentLoginPojo;

@Repository
public class StrudentDAOImpl implements StudentDAO
{
	@Autowired
	EntityManager eMan;
	@Override
	public boolean addStudent(StudentLoginPojo Student)
	{
		eMan.persist(Student);
		return true;
	}
	@Override
	public List<StudentLoginPojo> getStudent() 
	{
		// TODO Auto-generated method stub
		return eMan.createQuery("From StudentLoginPojo").getResultList();
	}
	@Override
	public boolean validateLogin(String Email,String password)
	{
		Query qry2=eMan.createNativeQuery("select * from studentlogin122 where Email=?1 and password=?2");
		qry2.setParameter(1,Email);
		qry2.setParameter(2,password);
		List<StudentLoginPojo> users=qry2.getResultList();		
			if(users.size()>0)
			return true;
			else
			return false;
	}
}
