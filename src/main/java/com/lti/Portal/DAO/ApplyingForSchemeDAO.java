package com.lti.Portal.DAO;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.lti.Portal.pojo.AcademicDetails;
import com.lti.Portal.pojo.BasicDetails;
import com.lti.Portal.pojo.ContactDetails;
import com.lti.Portal.pojo.FeeDetails;
import com.lti.Portal.pojo.OtherDetails;
import com.lti.Portal.pojo.SubmitDetails;
import com.lti.Portal.pojo.TenthDetails;
import com.lti.Portal.pojo.TwelthDetails;
@Repository
public interface ApplyingForSchemeDAO {
	public List<AcademicDetails> getAcademicDetails();
	public List<BasicDetails> getBasicDetails();
	public List<ContactDetails> getContactDetails();
	public List<FeeDetails> getFeeDetails();
	public List<OtherDetails> getOtherDetails();
	public List<TenthDetails> getTenthDetails();
	public List<TwelthDetails> getTwelthDetails();
	public List<SubmitDetails> getSubmitDetails();
	boolean addAcademicDetails(AcademicDetails academicDetails);
	boolean addBasicDetails(BasicDetails basicDetails);
	boolean addContactDetails(ContactDetails contactDetails);
	boolean addFeeDetails(FeeDetails feeDetails);
	boolean addOtherDetails(OtherDetails otherDetails);
	boolean addTenthDetails(TenthDetails tenthDetails);
	boolean addTwelthDetails(TwelthDetails twelthDetails);
	boolean addSubmitDetails(SubmitDetails submitDetails);
}
