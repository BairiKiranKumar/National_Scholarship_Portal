package com.lti.Portal.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.Portal.pojo.AdminLoginPojo;
@Repository
public class AdminLoginDAOImpl implements AdminLoginDAO
{
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addAdmin(AdminLoginPojo Admin) {
		// TODO Auto-generated method stub
		eMan.persist(Admin);
		return true;
	}

	@Override
	public List<AdminLoginPojo>getAdmin() {
		// TODO Auto-generated method stub
		return eMan.createQuery("From AdminLoginPojo").getResultList();
	}

	@Override
	public boolean validateLogin(String Email, String password) {
		// TODO Auto-generated method stub
		Query qry2=eMan.createNativeQuery("select * from adminlogin123 where Admin=?1 and Password=?2");
		qry2.setParameter(1,Email);
		qry2.setParameter(2,password);
		List<AdminLoginPojo> users=qry2.getResultList();		
			if(users.size()>0)
			return true;
			else
			return false;
	}

}
