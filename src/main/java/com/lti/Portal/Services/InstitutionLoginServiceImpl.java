package com.lti.Portal.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Portal.DAO.InstitutionLoginDAO;
import com.lti.Portal.pojo.InstitutionLogin;


@Service
@Transactional
public class InstitutionLoginServiceImpl implements InstitutionLoginService
{
	@Autowired
	InstitutionLoginDAO instlogin;
	@Override
	public List<InstitutionLogin> getInstitutionLogins() 
	{
		return instlogin.getInstitutionLogin();
	}
	@Override
	public boolean addInstitutionLogin(InstitutionLogin institutionlogin)
	{	
		return instlogin.addInstitutionLogin(institutionlogin);
	}
	@Override
	public boolean validateLogin(String loginid,String password)
	{
		return instlogin.validateLogin(loginid,password);
	}

}
