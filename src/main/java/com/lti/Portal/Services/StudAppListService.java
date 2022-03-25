package com.lti.Portal.Services;
import java.util.List;

import com.lti.Portal.pojo.StudentAppListPojo;



public interface StudAppListService
{
	public boolean addStudentAppList(StudentAppListPojo studentapplist);
	public List<StudentAppListPojo>getStudentAppLists();
}
