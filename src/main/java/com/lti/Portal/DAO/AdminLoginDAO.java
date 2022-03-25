package com.lti.Portal.DAO;

import java.util.List;

import com.lti.Portal.pojo.AdminLoginPojo;


public interface AdminLoginDAO 
{
	public boolean addAdmin(AdminLoginPojo Admin);
	public List<AdminLoginPojo>getAdmin();
	public boolean validateLogin(String Email,String password);
}
