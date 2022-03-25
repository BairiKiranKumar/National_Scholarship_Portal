package com.lti.Portal.Services;

import java.util.List;

import com.lti.Portal.pojo.AdminLoginPojo;

public interface AdminLoginService 
{
	public boolean addAdmin(AdminLoginPojo Admin);
	public List<AdminLoginPojo>getAdmins();
	public boolean validateLogin(String Email,String password);

}
