package com.lti.Portal.DAO;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lti.Portal.Controller.StudentController;
import com.lti.Portal.pojo.StudentAppListPojo;
@Repository
public class MinistryDAOImpl implements MinistryDAO
{
	@Autowired
	EntityManager eMan;	
		@Override
		public boolean addStudentAppList(StudentAppListPojo studentapplist) {
			eMan.merge(studentapplist);
			return true;
		}
		@Override
		public List<StudentAppListPojo>getStudentAppLists() 
		{
			StudentController con=new StudentController();
			return eMan.createQuery("from StudentAppList").getResultList();
		}
}
	
	
	
	
	
	
	
	
	
	
	
	


