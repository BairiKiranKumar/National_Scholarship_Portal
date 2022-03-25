package com.lti.Portal.Services;

import java.util.List;
import com.lti.Portal.pojo.InstitutionRegistration;
public interface InstitutionRegistrationService 
{
public boolean  addInstitution(InstitutionRegistration institution);
public List<InstitutionRegistration> getInstitutions();




}
