package com.lti.Portal.DAO;
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.lti.Portal.pojo.StudentLoginPojo;
public interface StudentDAO
{
	public boolean addStudent(StudentLoginPojo Student);
	public List<StudentLoginPojo>getStudent();
	public boolean validateLogin(String Email,String password);
}
