package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="institutehome123")
public class InstituteHomePojo 
{
	@Id
	@Column(name="loginid")
	private String loginid;
	@Column(name="institution")
	private String institution;
	@Column(name="presentclass")
	private String presentClass;
	@Column(name="presentclassyear")
	private String presentClassYear;
	@Column(name="modeofstudy")
	private String modeofstudy;
	@Column(name="classstartdate")
	private String classofdate;
	@Column(name="university")
	private String university;
	@Column(name="previousclass")
	private String previousClass;
	@Column(name="previousclassyear")
	private String previousClassYear;
	@Column(name="previouspercentage")
	private String previousPercentage;
	@Column(name="aadhar")
	private String aadharno;
	@Column(name="religion")
	private String religion;
	@Column(name="community")
	private String community;
	@Column(name="fathername")
	private String fatherName;
	@Column(name="mothername")
	private String motherName;
	@Column(name="familyAnnualIncome")
	private String annualIncome;
	@Column(name="State")
	private String state;
	@Column(name="District")
	private String district;
	@Column(name="Taluk")
	private String taluk;
	@Column(name="Houseno")
	private String houseno;
	@Column(name="Streetno")
	private String streetno;
	@Column(name="pincode")
	private int pincode;
	@Column(name="Admissionfee")
	private String admissionfee;
	@Column(name="Tuitionfee")
	private String tuitionfee;
	@Column(name="Otherfee")
	private String otherfee;
	@Column(name="isdisabled")
	private String isdisabled;
	@Column(name="typeofdisability")
	private String typeofdisability;
	@Column(name="disabilitypercentage")
	private String disablitypercentage;
	@Column(name="maritalstatus")
	private String maritalstatus;
	@Column(name="parentsprofession")
	private String parentsprofession;
	@Column(name="gender")
	private String gender;
	@Column(name="scheme")
	private String scheme;
	@Column(name="tenthrollno")
	private String tenthrollno;
	@Column(name="tenthboardname")
	private String tenthboardname;
	@Column(name="tenthyear")
	private String tenthyear;
	@Column(name="tenthpercentage")
	private String tenthpercentage;
	@Column(name="twelthrollno")
	private String twelthrollno;
	@Column(name="twelthboardname")
	private String twelthboardname;
	@Column(name="twelthyear")
	private String twelthyear;
	@Column(name="twelthpercentage")
	private String twelthpercentage;
	@Column(name="bankname")
	private String bankname;
	@Column(name="accountno")
	private String accountno;
	@Column(name="ifsc")
	private String ifsc;
	
	@Override
	public String toString() {
		return "InstituteHomePojo [loginid=" + loginid + ", institution=" + institution + ", presentClass="
				+ presentClass + ", presentClassYear=" + presentClassYear + ", modeofstudy=" + modeofstudy
				+ ", classofdate=" + classofdate + ", university=" + university + ", previousClass=" + previousClass
				+ ", previousClassYear=" + previousClassYear + ", previousPercentage=" + previousPercentage
				+ ", aadharno=" + aadharno + ", religion=" + religion + ", community=" + community + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", annualIncome=" + annualIncome + ", state=" + state
				+ ", district=" + district + ", taluk=" + taluk + ", houseno=" + houseno + ", streetno=" + streetno
				+ ", pincode=" + pincode + ", admissionfee=" + admissionfee + ", tuitionfee=" + tuitionfee
				+ ", otherfee=" + otherfee + ", isdisabled=" + isdisabled + ", typeofdisability=" + typeofdisability
				+ ", disablitypercentage=" + disablitypercentage + ", maritalstatus=" + maritalstatus
				+ ", parentsprofession=" + parentsprofession + ", gender=" + gender + ", scheme=" + scheme
				+ ", tenthrollno=" + tenthrollno + ", tenthboardname=" + tenthboardname + ", tenthyear=" + tenthyear
				+ ", tenthpercentage=" + tenthpercentage + ", twelthrollno=" + twelthrollno + ", twelthboardname="
				+ twelthboardname + ", twelthyear=" + twelthyear + ", twelthpercentage=" + twelthpercentage
				+ ", bankname=" + bankname + ", accountno=" + accountno + ", ifsc=" + ifsc + "]";
	}
	
	public InstituteHomePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public InstituteHomePojo(String loginid, String institution, String presentClass, String presentClassYear,
			String modeofstudy, String classofdate, String university, String previousClass, String previousClassYear,
			String previousPercentage, String aadharno, String religion, String community, String fatherName,
			String motherName, String annualIncome, String state, String district, String taluk, String houseno,
			String streetno, int pincode, String admissionfee, String tuitionfee, String otherfee, String isdisabled,
			String typeofdisability, String disablitypercentage, String maritalstatus, String parentsprofession,
			String gender, String scheme, String tenthrollno, String tenthboardname, String tenthyear,
			String tenthpercentage, String twelthrollno, String twelthboardname, String twelthyear,
			String twelthpercentage, String bankname, String accountno, String ifsc) {
		super();
		this.loginid = loginid;
		this.institution = institution;
		this.presentClass = presentClass;
		this.presentClassYear = presentClassYear;
		this.modeofstudy = modeofstudy;
		this.classofdate = classofdate;
		this.university = university;
		this.previousClass = previousClass;
		this.previousClassYear = previousClassYear;
		this.previousPercentage = previousPercentage;
		this.aadharno = aadharno;
		this.religion = religion;
		this.community = community;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.annualIncome = annualIncome;
		this.state = state;
		this.district = district;
		this.taluk = taluk;
		this.houseno = houseno;
		this.streetno = streetno;
		this.pincode = pincode;
		this.admissionfee = admissionfee;
		this.tuitionfee = tuitionfee;
		this.otherfee = otherfee;
		this.isdisabled = isdisabled;
		this.typeofdisability = typeofdisability;
		this.disablitypercentage = disablitypercentage;
		this.maritalstatus = maritalstatus;
		this.parentsprofession = parentsprofession;
		this.gender = gender;
		this.scheme = scheme;
		this.tenthrollno = tenthrollno;
		this.tenthboardname = tenthboardname;
		this.tenthyear = tenthyear;
		this.tenthpercentage = tenthpercentage;
		this.twelthrollno = twelthrollno;
		this.twelthboardname = twelthboardname;
		this.twelthyear = twelthyear;
		this.twelthpercentage = twelthpercentage;
		this.bankname = bankname;
		this.accountno = accountno;
		this.ifsc = ifsc;
	}

	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getPresentClass() {
		return presentClass;
	}
	public void setPresentClass(String presentClass) {
		this.presentClass = presentClass;
	}
	public String getPresentClassYear() {
		return presentClassYear;
	}
	public void setPresentClassYear(String presentClassYear) {
		this.presentClassYear = presentClassYear;
	}
	public String getModeofstudy() {
		return modeofstudy;
	}
	public void setModeofstudy(String modeofstudy) {
		this.modeofstudy = modeofstudy;
	}
	public String getClassofdate() {
		return classofdate;
	}
	public void setClassofdate(String classofdate) {
		this.classofdate = classofdate;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getPreviousClass() {
		return previousClass;
	}
	public void setPreviousClass(String previousClass) {
		this.previousClass = previousClass;
	}
	public String getPreviousClassYear() {
		return previousClassYear;
	}
	public void setPreviousClassYear(String previousClassYear) {
		this.previousClassYear = previousClassYear;
	}
	public String getPreviousPercentage() {
		return previousPercentage;
	}
	public void setPreviousPercentage(String previousPercentage) {
		this.previousPercentage = previousPercentage;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTaluk() {
		return taluk;
	}
	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAdmissionfee() {
		return admissionfee;
	}
	public void setAdmissionfee(String admissionfee) {
		this.admissionfee = admissionfee;
	}
	public String getTuitionfee() {
		return tuitionfee;
	}
	public void setTuitionfee(String tuitionfee) {
		this.tuitionfee = tuitionfee;
	}
	public String getOtherfee() {
		return otherfee;
	}
	public void setOtherfee(String otherfee) {
		this.otherfee = otherfee;
	}
	public String getIsdisabled() {
		return isdisabled;
	}
	public void setIsdisabled(String isdisabled) {
		this.isdisabled = isdisabled;
	}
	public String getTypeofdisability() {
		return typeofdisability;
	}
	public void setTypeofdisability(String typeofdisability) {
		this.typeofdisability = typeofdisability;
	}
	public String getDisablitypercentage() {
		return disablitypercentage;
	}
	public void setDisablitypercentage(String disablitypercentage) {
		this.disablitypercentage = disablitypercentage;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getParentsprofession() {
		return parentsprofession;
	}
	public void setParentsprofession(String parentsprofession) {
		this.parentsprofession = parentsprofession;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getTenthrollno() {
		return tenthrollno;
	}
	public void setTenthrollno(String tenthrollno) {
		this.tenthrollno = tenthrollno;
	}
	public String getTenthboardname() {
		return tenthboardname;
	}
	public void setTenthboardname(String tenthboardname) {
		this.tenthboardname = tenthboardname;
	}
	public String getTenthyear() {
		return tenthyear;
	}
	public void setTenthyear(String tenthyear) {
		this.tenthyear = tenthyear;
	}
	public String getTenthpercentage() {
		return tenthpercentage;
	}
	public void setTenthpercentage(String tenthpercentage) {
		this.tenthpercentage = tenthpercentage;
	}
	public String getTwelthrollno() {
		return twelthrollno;
	}
	public void setTwelthrollno(String twelthrollno) {
		this.twelthrollno = twelthrollno;
	}
	public String getTwelthboardname() {
		return twelthboardname;
	}
	public void setTwelthboardname(String twelthboardname) {
		this.twelthboardname = twelthboardname;
	}
	public String getTwelthyear() {
		return twelthyear;
	}
	public void setTwelthyear(String twelthyear) {
		this.twelthyear = twelthyear;
	}
	public String getTwelthpercentage() {
		return twelthpercentage;
	}
	public void setTwelthpercentage(String twelthpercentage) {
		this.twelthpercentage = twelthpercentage;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	
}