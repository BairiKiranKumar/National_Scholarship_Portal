package com.lti.Portal.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Portal.DAO.MinistryDAO;
import com.lti.Portal.pojo.StudentAppListPojo;


@Service
@Transactional
public class StudAppListServiceImpl implements StudAppListService {
	
	@Autowired
	MinistryDAO mdao;
	@Override
	public List<StudentAppListPojo> getStudentAppLists() {
		return mdao.getStudentAppLists();
	}

	@Override
	public boolean addStudentAppList(StudentAppListPojo studentapplist) {
		// TODO Auto-generated method stub
		return mdao.addStudentAppList(studentapplist);
	}

}
