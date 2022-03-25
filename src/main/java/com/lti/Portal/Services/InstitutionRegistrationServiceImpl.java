package com.lti.Portal.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Portal.DAO.InstitutionRegistrationDAO;
import com.lti.Portal.pojo.InstitutionRegistration;


@Service
@Transactional
public class InstitutionRegistrationServiceImpl implements InstitutionRegistrationService
{	
	@Autowired 
	InstitutionRegistrationDAO idao;

	@Override
	public boolean addInstitution(InstitutionRegistration institution) {
	
		return idao.addInstitution(institution);
	}

	@Override
	public List<InstitutionRegistration> getInstitutions() {
		
		return idao.getInstitution();
	}

}
