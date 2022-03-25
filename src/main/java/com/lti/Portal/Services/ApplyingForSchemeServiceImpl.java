package com.lti.Portal.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Portal.DAO.ApplyingForSchemeDAO;
import com.lti.Portal.pojo.AcademicDetails;
import com.lti.Portal.pojo.BasicDetails;
import com.lti.Portal.pojo.ContactDetails;
import com.lti.Portal.pojo.FeeDetails;
import com.lti.Portal.pojo.OtherDetails;
import com.lti.Portal.pojo.SubmitDetails;
import com.lti.Portal.pojo.TenthDetails;
import com.lti.Portal.pojo.TwelthDetails;



@Service
@Transactional
public  class ApplyingForSchemeServiceImpl implements ApplyingForSchemeService{
      @Autowired
      ApplyingForSchemeDAO adao;

	@Override
	public List<AcademicDetails> getAcademicDetails() {
		// TODO Auto-generated method stub
		return adao.getAcademicDetails();
	}

	@Override
	public List<BasicDetails> getBasicDetails() {
		// TODO Auto-generated method stub
		return adao.getBasicDetails();
	}

	@Override
	public List<ContactDetails> getContactDetails() {
		// TODO Auto-generated method stub
		return adao.getContactDetails();
	}

	@Override
	public List<FeeDetails> getFeeDetails() {
		// TODO Auto-generated method stub
		return adao.getFeeDetails();
	}

	@Override
	public List<OtherDetails> getOtherDetails() {
		// TODO Auto-generated method stub
		return adao.getOtherDetails();
	}

	@Override
	public List<TenthDetails> getTenthDetails() {
		// TODO Auto-generated method stub
		return adao.getTenthDetails();
	}

	@Override
	public List<TwelthDetails> getTwelthDetails() {
		// TODO Auto-generated method stub
		return adao.getTwelthDetails();
	}

	@Override
	public boolean addAcademicDetails(AcademicDetails academicDetails) {
		// TODO Auto-generated method stub
		
		return adao.addAcademicDetails(academicDetails);
	}

	@Override
	public boolean addBasicDetails(BasicDetails basicDetails) {
		// TODO Auto-generated method stub
		return adao.addBasicDetails(basicDetails);
	}

	@Override
	public boolean addContactDetails(ContactDetails contactDetails) {
		// TODO Auto-generated method stub
		return adao.addContactDetails(contactDetails);
	}

	@Override
	public boolean addFeeDetails(FeeDetails feeDetails) {
		// TODO Auto-generated method stub
		return adao.addFeeDetails(feeDetails);
	}

	@Override
	public boolean addOtherDetails(OtherDetails otherDetails) {
		// TODO Auto-generated method stub
		return adao.addOtherDetails(otherDetails);
	}

	@Override
	public boolean addTenthDetails(TenthDetails tenthDetails) {
		// TODO Auto-generated method stub
		return adao.addTenthDetails(tenthDetails);
	}

	@Override
	public boolean addTwelthDetails(TwelthDetails twelthDetails) {
		// TODO Auto-generated method stub
		return adao.addTwelthDetails(twelthDetails);
	}

	@Override
	public List<SubmitDetails> getSubmitDetails() {
		// TODO Auto-generated method stub
		return adao.getSubmitDetails();
	}

	@Override
	public boolean addSubmitDetails(SubmitDetails submitDetails) {
		// TODO Auto-generated method stub
		return adao.addSubmitDetails(submitDetails);
	}
    
   
}
