package com.lti.Portal.DAO;
import java.util.List;
import com.lti.Portal.pojo.StudentAppListPojo;
public interface MinistryDAO
{
	public boolean addStudentAppList(StudentAppListPojo studentapplist);
	public List<StudentAppListPojo>getStudentAppLists();
}
