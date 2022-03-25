package com.lti.Portal.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Portal.DAO.AdminLoginDAO;
import com.lti.Portal.pojo.AdminLoginPojo;
@Service
@Transactional
public class AdminLoginServiceImpl implements AdminLoginService
{
	@Autowired
	AdminLoginDAO Adm;

	@Override
	public boolean addAdmin(AdminLoginPojo Admin) 
	{
		// TODO Auto-generated method stub
		return Adm.addAdmin(Admin);
	}

	@Override
	public List<AdminLoginPojo> getAdmins() 
	{
		// TODO Auto-generated method stub
		return Adm.getAdmin();
	}

	@Override
	public boolean validateLogin(String Email, String password) 
	{
		// TODO Auto-generated method stub
		return Adm.validateLogin(Email, password);
	}

}
