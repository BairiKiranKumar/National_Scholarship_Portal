package com.lti.Portal.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.Portal.pojo.InstituteHomePojo;
@Repository
public class InstituteHomeDAOImpl implements InstituteHomeDAO
{
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addInstituteHome(InstituteHomePojo Institute) {
		// TODO Auto-generated method stub
		eMan.persist(Institute);
		return true;
	}

	@Override
	public List<InstituteHomePojo> InstituteHome() {
		// TODO Auto-generated method stub
		return eMan.createQuery("From InstituteHomePojo").getResultList();
	}

	@Override
	public InstituteHomePojo validateUser(String Institution) {
		// TODO Auto-generated method stub
		InstituteHomePojo obj=eMan.find(InstituteHomePojo.class, Institution);
		return obj;
	}
	
}
