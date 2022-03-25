package com.lti.Portal.DAO;

import java.util.List;

import com.lti.Portal.pojo.InstitutionRegistration;
public interface InstitutionRegistrationDAO 
{
	public boolean addInstitution (InstitutionRegistration institution);
	public List<InstitutionRegistration> getInstitution();
}
