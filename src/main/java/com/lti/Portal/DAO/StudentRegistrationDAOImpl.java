package com.lti.Portal.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lti.Portal.pojo.StudentAppListPojo;
import com.lti.Portal.pojo.StudentHome;
import com.lti.Portal.pojo.StudentLoginPojo;
import com.lti.Portal.pojo.StudentRegistrationPojo;
@Repository
public class StudentRegistrationDAOImpl implements StudentRegistrationDAO
{
	@Autowired
	EntityManager eMan;
	@Override
	public boolean addStudentregistration(StudentRegistrationPojo Student)
	{
		/*StudentRegistrationPojo shaow=new StudentRegistrationPojo(4816416d, "String stateofDomicile", "String gender","ndayb",
				4816416d, "String email","String institutionCode","String setPassword","String confirmPassword");*/
		
		eMan.persist(Student);
		StudentLoginPojo stu=new StudentLoginPojo();
		StudentAppListPojo stud=new StudentAppListPojo();
		StudentHome hom=new StudentHome();	
		hom.setName(Student.getName());
		stud.setName(Student.getName());
		stud.setEmail(Student.getEmail());
		stud.setAdhaar(Student.getAadharNumber());
		stu.setEmail(Student.getEmail());
		stu.setPass(Student.getConfirmPassword());
		//hom.setEmail(Student.getEmail());
		eMan.merge(hom);
		eMan.persist(stud);
		eMan.persist(stu);
		return true;
	}
	@Override
	public List<StudentRegistrationPojo>getStudentregistration()
	{
		return eMan.createQuery("From StudentRegistrationPojo").getResultList();
	}
	
}
