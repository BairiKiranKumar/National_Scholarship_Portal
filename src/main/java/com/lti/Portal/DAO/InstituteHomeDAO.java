package com.lti.Portal.DAO;

import java.util.List;

import com.lti.Portal.pojo.InstituteHomePojo;

public interface InstituteHomeDAO 
{
	public boolean addInstituteHome(InstituteHomePojo Student);
	public List<InstituteHomePojo>InstituteHome();
	public InstituteHomePojo validateUser(String Institution);
}
