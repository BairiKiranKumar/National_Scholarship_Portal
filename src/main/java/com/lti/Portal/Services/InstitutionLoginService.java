package com.lti.Portal.Services;

import java.util.List;

import com.lti.Portal.pojo.InstitutionLogin;


public interface InstitutionLoginService
{
	public boolean addInstitutionLogin(InstitutionLogin institutionlogin);
	public List<InstitutionLogin>getInstitutionLogins();
	public boolean validateLogin(String loginid,String password);
}
