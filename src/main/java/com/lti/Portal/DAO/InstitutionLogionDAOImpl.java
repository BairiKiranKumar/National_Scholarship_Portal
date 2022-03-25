package com.lti.Portal.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.Portal.pojo.InstitutionLogin;
import com.lti.Portal.pojo.StudentLoginPojo;


@Repository
public class InstitutionLogionDAOImpl implements InstitutionLoginDAO
{
	
	@Autowired
	EntityManager eMan;
	@Override
	public boolean addInstitutionLogin(InstitutionLogin institutionlogin)
	{
		eMan.persist(institutionlogin);
		return true;
	}

	@Override
	public List<InstitutionLogin> getInstitutionLogin() {
		
		return eMan.createQuery("from InstitutionLogin").getResultList();
	}
	@Override
	public boolean validateLogin(String loginid,String password)
	{
		Query qry2=eMan.createNativeQuery("select * from institutionlogin123 where loginid=?1 and password=?2");
		qry2.setParameter(1,loginid);
		qry2.setParameter(2,password);
		List<InstitutionLogin> users=qry2.getResultList();		
			if(users.size()>0)
			return true;
			else
			return false;
	}

}

	


