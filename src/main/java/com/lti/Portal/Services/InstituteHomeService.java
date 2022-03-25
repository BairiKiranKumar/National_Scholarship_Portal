package com.lti.Portal.Services;

import java.util.List;

import com.lti.Portal.pojo.InstituteHomePojo;

public interface InstituteHomeService 
{
	public boolean addInstituteHome(InstituteHomePojo Institute);
	public List<InstituteHomePojo>InstituteHomes();
	public InstituteHomePojo validateUser(String Institution);
}
