package com.lti.Portal.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lti.Portal.pojo.InstitutionLogin;
import com.lti.Portal.pojo.InstitutionRegistration;
@Repository
public class InstitutionRegistrationDAOImpl implements InstitutionRegistrationDAO 
{
	@Autowired
	EntityManager eMan;
	@Override
	public boolean addInstitution(InstitutionRegistration institution) 
	{
		eMan.persist(institution);
		InstitutionLogin log=new InstitutionLogin();
		log.setLoginId(institution.getEmail());
		log.setPassword(institution.getConfirmPassword());
		eMan.persist(log);
		return true;
	}
	@Override
	public List<InstitutionRegistration> getInstitution() 
	{
		// TODO Auto-generated method stub
		return eMan.createQuery("from InstitutionRegistration").getResultList();
	}
}
