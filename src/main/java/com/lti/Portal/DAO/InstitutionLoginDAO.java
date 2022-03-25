package com.lti.Portal.DAO;
import java.util.List;

import com.lti.Portal.pojo.InstitutionLogin;

public interface InstitutionLoginDAO 
{
	public boolean addInstitutionLogin(InstitutionLogin institutionlogin);
	public List<InstitutionLogin>getInstitutionLogin();
	public boolean validateLogin(String loginid,String password);
}
