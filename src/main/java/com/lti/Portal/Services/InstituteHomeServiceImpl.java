package com.lti.Portal.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Portal.DAO.InstituteHomeDAO;
import com.lti.Portal.pojo.InstituteHomePojo;
@Service
@Transactional
public class InstituteHomeServiceImpl implements InstituteHomeService
{
	@Autowired
	InstituteHomeDAO institute;

	@Override
	public boolean addInstituteHome(InstituteHomePojo Institute) {
		// TODO Auto-generated method stub
		return institute.addInstituteHome(Institute);
	}

	@Override
	public List<InstituteHomePojo> InstituteHomes() {
		// TODO Auto-generated method stub
		return institute.InstituteHome();
	}

	@Override
	public InstituteHomePojo validateUser(String Institution) {
		// TODO Auto-generated method stub
		return institute.validateUser(Institution);
	}
	
}
