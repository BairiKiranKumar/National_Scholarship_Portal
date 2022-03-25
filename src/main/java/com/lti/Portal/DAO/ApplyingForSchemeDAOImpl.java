package com.lti.Portal.DAO;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lti.Portal.pojo.AcademicDetails;
import com.lti.Portal.pojo.BasicDetails;
import com.lti.Portal.pojo.ContactDetails;
import com.lti.Portal.pojo.FeeDetails;
import com.lti.Portal.pojo.InstituteHomePojo;
import com.lti.Portal.pojo.OtherDetails;
import com.lti.Portal.pojo.StudentAppListPojo;
import com.lti.Portal.pojo.StudentHome;
import com.lti.Portal.pojo.SubmitDetails;
import com.lti.Portal.pojo.TenthDetails;
import com.lti.Portal.pojo.TwelthDetails;


@Repository
public class ApplyingForSchemeDAOImpl implements ApplyingForSchemeDAO{
	 @Autowired
     EntityManager eMan;
        
	    @Override
	    public boolean addAcademicDetails(AcademicDetails academicDetails)
	    {
	    	eMan.persist(academicDetails);
	    	return true;
	    }
	    @Override
	    public boolean addBasicDetails(BasicDetails basicDetails) 
	    {
//	    	StudentHome stu=new StudentHome();
//	    	AcademicDetails acc= new AcademicDetails();
//			ContactDetails con= new ContactDetails();
//			FeeDetails fee=new FeeDetails();
//			OtherDetails oth=new OtherDetails();
//			SubmitDetails sub=new SubmitDetails();
//			TenthDetails ten=new TenthDetails();
//			TwelthDetails twe=new TwelthDetails();
//			InstituteHomePojo hom=new InstituteHomePojo();
	    	eMan.persist(basicDetails);
//	    	hom.setLoginid(basicDetails.getLoginid());
//	    	hom.setAadharno(basicDetails.getAadharno());
//	    	hom.setReligion(basicDetails.getReligion());
//	    	hom.setCommunity(basicDetails.getCommunity());
//	    	hom.setFatherName(basicDetails.getFatherName());
//	    	hom.setMotherName(basicDetails.getMotherName());
//	    	hom.setAnnualIncome(basicDetails.getAnnualIncome());
//	    	acc.setLoginId(basicDetails.getLoginid());
//			con.setLoginid(basicDetails.getLoginid());
//			fee.setLoginid(basicDetails.getLoginid());
//			oth.setLoginid(basicDetails.getLoginid());
//			sub.setLoginid(basicDetails.getLoginid());
//			ten.setLoginid(basicDetails.getLoginid());
//			twe.setLoginid(basicDetails.getLoginid());
//	    	stu.setCommunity(basicDetails.getCommunity());
//	    	stu.setEmail(basicDetails.getLoginid());
//	    	eMan.merge(hom);
//	    	eMan.merge(acc);
//			eMan.merge(con);
//			eMan.merge(fee);
//			eMan.merge(oth);
//			eMan.merge(sub);
//			eMan.merge(ten);
//			eMan.merge(twe);
//	    	eMan.merge(stu);
	    	return true;
	    }
	    @Override
	    public boolean addContactDetails(ContactDetails contactDetails) 
	    {
	    	InstituteHomePojo hom=new InstituteHomePojo();
	    	eMan.merge(contactDetails);
	    	hom.setState(contactDetails.getState());
	    	hom.setDistrict(contactDetails.getDistrict());
	    	hom.setTaluk(contactDetails.getTaluk());
	    	hom.setHouseno(contactDetails.getHouseno());
	    	hom.setStreetno(contactDetails.getStreetno());
	    	hom.setPincode(contactDetails.getPincode());
	    	eMan.merge(hom);
	    	
	    	return true;
	    }
	    @Override
	    public boolean addFeeDetails(FeeDetails feeDetails) 
	    {
	    	InstituteHomePojo hom=new InstituteHomePojo();
	    	eMan.merge(feeDetails);
	    	hom.setAdmissionfee(feeDetails.getAdmissionfee());
	    	hom.setTuitionfee(feeDetails.getTuitionfee());
	    	hom.setOtherfee(feeDetails.getOtherfee());
	    	eMan.merge(hom);
	    	return true;
	    }
	    @Override
	    public boolean addOtherDetails(OtherDetails otherDetails) 
	    {
	    	InstituteHomePojo hom=new InstituteHomePojo();
	    	eMan.merge(otherDetails);
	    	hom.setIsdisabled(otherDetails.getDisablitypercentage());
	    	hom.setTypeofdisability(otherDetails.getTypeofdisability());
	    	hom.setDisablitypercentage(otherDetails.getDisablitypercentage());
	    	hom.setMaritalstatus(otherDetails.getMaritalstatus());
	    	hom.setParentsprofession(otherDetails.getParentsprofession());;
	    	eMan.merge(hom);
	    	return true;
	    }
	    @Override
	    public boolean addTenthDetails(TenthDetails tenthDetails) 
	    {
	    	eMan.merge(tenthDetails);
	    	InstituteHomePojo hom1=new InstituteHomePojo();
	    	StudentHome hom=new StudentHome();
	    	hom1.setTenthrollno(tenthDetails.getTenthrollno());
	    	hom1.setTenthboardname(tenthDetails.getTenthboardname());
	    	hom1.setTenthyear(tenthDetails.getTenthyear());
	    	hom1.setTenthpercentage(tenthDetails.getTenthpercentage());
	    	hom.setTenthper(tenthDetails.getTenthpercentage());
	    	eMan.merge(hom);
	    	eMan.merge(hom1);
	    	return true;
	    }
	    @Override
	    public boolean addTwelthDetails(TwelthDetails twelthDetails) 
	    {
	    	InstituteHomePojo hom1=new InstituteHomePojo();
	    	eMan.merge(twelthDetails);
	    	StudentHome hom=new StudentHome();
	    	hom1.setTwelthrollno(twelthDetails.getTwelthrollno());
	    	hom1.setTwelthboardname(twelthDetails.getTwelthboardname());
	    	hom1.setTwelthyear(twelthDetails.getTwelthyear());
	    	hom1.setTwelthpercentage(twelthDetails.getTwelthpercentage());
	    	hom.setTwelper(twelthDetails.getTwelthpercentage());
	    	eMan.merge(hom);
	    	eMan.merge(hom1);
	    	return true;
	    }
	    @Override
	    public boolean addSubmitDetails(SubmitDetails submitDetails)
	    {
			// TODO Auto-generated method stub
			eMan.merge(submitDetails);
			InstituteHomePojo hom1=new InstituteHomePojo();
			StudentHome hom=new StudentHome();
			StudentAppListPojo app=new StudentAppListPojo();
			hom1.setGender(submitDetails.getGender());
			hom1.setScheme(submitDetails.getScheme());
			app.setScholarship(submitDetails.getScheme());
			hom.setScheme(submitDetails.getScheme());
			eMan.merge(hom1);
			eMan.merge(app);
			eMan.merge(hom);
			return true;
		}
	    @Override
	    public List<AcademicDetails> getAcademicDetails(){
	    	return eMan.createQuery("from AcademicDetails").getResultList();
	    }
	    @Override
		public List<BasicDetails> getBasicDetails(){
	    	return eMan.createQuery("from BasicDetails").getResultList();
	    }
	    @Override
		public List<ContactDetails> getContactDetails(){
	    	return eMan.createQuery("from ContactDetails").getResultList();
	    }
	    @Override
		public List<FeeDetails> getFeeDetails(){
	    	return eMan.createQuery("from FeeDetails").getResultList();
	    }
	    @Override
		public List<OtherDetails> getOtherDetails(){
	    	return eMan.createQuery("from OtherDetails").getResultList();
	    }
	    @Override
		public List<TenthDetails> getTenthDetails(){
	    	return eMan.createQuery("from TenthDetails").getResultList();
	    }
	    @Override
		public List<TwelthDetails> getTwelthDetails(){
	    	return eMan.createQuery("from TwelthDetails").getResultList();
	    }
		@Override
		public List<SubmitDetails> getSubmitDetails() {
			// TODO Auto-generated method stub
			return eMan.createQuery("from SubmitDetails").getResultList();
		}
		
		
}
