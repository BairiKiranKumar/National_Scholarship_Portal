package com.lti.Portal.Services;

import java.util.List;

import com.lti.Portal.pojo.AcademicDetails;
import com.lti.Portal.pojo.BasicDetails;
import com.lti.Portal.pojo.ContactDetails;
import com.lti.Portal.pojo.FeeDetails;
import com.lti.Portal.pojo.OtherDetails;
import com.lti.Portal.pojo.SubmitDetails;
import com.lti.Portal.pojo.TenthDetails;
import com.lti.Portal.pojo.TwelthDetails;



public interface ApplyingForSchemeService {
	public List<AcademicDetails> getAcademicDetails();
	public List<BasicDetails> getBasicDetails();
	public List<ContactDetails> getContactDetails();
	public List<FeeDetails> getFeeDetails();
	public List<OtherDetails> getOtherDetails();
	public List<TenthDetails> getTenthDetails();
	public List<TwelthDetails> getTwelthDetails();
	public List<SubmitDetails> getSubmitDetails();
	public boolean addAcademicDetails(AcademicDetails academicDetails);
	public boolean addBasicDetails(BasicDetails basicDetails);
	public boolean addContactDetails(ContactDetails contactDetails);
	public boolean addFeeDetails(FeeDetails feeDetails);
	public boolean addOtherDetails(OtherDetails otherDetails);
	public boolean addTenthDetails(TenthDetails tenthDetails);
	public boolean addTwelthDetails(TwelthDetails twelthDetails);
	public boolean addSubmitDetails(SubmitDetails submitDetails);
}
