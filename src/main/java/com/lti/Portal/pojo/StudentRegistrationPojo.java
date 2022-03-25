package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="studentregistration11")
public class StudentRegistrationPojo 
{
	@Id
	@Column(name="adharnumber")
	private String AadharNumber;
	@Column(name="stateofdomicile")
	private String StateofDomicile;
	@Column(name="dist")
	private String dist;
	@Column(name="name")
	private String Name;
	@Column(name="dob")
	private String dob;
	@Column(name="gender")
	private String Gender;
	@Column(name="mobilenumber")
	private String MobileNumber;
	@Column(name="email")
	private String Email;
	@Column(name="bankname")
	private String bankname;
	@Column(name="accountno")
	private String accountno;
	@Column(name="ifsc")
	private String ifsc;
	@Column(name="community")
	private String community;
	@Column(name="institutioncode")
	private String InstitutionCode;
	@Column(name="setpassword")
	private String SetPassword;
	@Column(name="comfirmpassword")
	private String ConfirmPassword;	
	
	@Override
	public String toString() {
		return "StudentRegistrationPojo [AadharNumber=" + AadharNumber + ", StateofDomicile=" + StateofDomicile
				+ ", dist=" + dist + ", Name=" + Name + ", dob=" + dob + ", Gender=" + Gender + ", MobileNumber="
				+ MobileNumber + ", Email=" + Email + ", bankname=" + bankname + ", accountno=" + accountno + ", ifsc="
				+ ifsc + ", InstitutionCode=" + InstitutionCode + ", SetPassword=" + SetPassword + ", ConfirmPassword="
				+ ConfirmPassword + "]";
	}

	public StudentRegistrationPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentRegistrationPojo(String aadharNumber, String stateofDomicile, String dist, String name, String dob,
			String gender, String mobileNumber, String email, String bankname, String accountno, String ifsc,
			String institutionCode, String setPassword, String confirmPassword) {
		super();
		this.AadharNumber = aadharNumber;
		this.StateofDomicile = stateofDomicile;
		this.dist = dist;
		this.Name = name;
		this.dob = dob;
		this.Gender = gender;
		this.MobileNumber = mobileNumber;
		this.Email = email;
		this.bankname = bankname;
		this.accountno = accountno;
		this.ifsc = ifsc;
		this.InstitutionCode = institutionCode;
		this.SetPassword = setPassword;
		this.ConfirmPassword = confirmPassword;
	}

	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
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
	public String getAadharNumber() {
		return AadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		AadharNumber = aadharNumber;
	}
	public String getStateofDomicile() {
		return StateofDomicile;
	}
	public void setStateofDomicile(String stateofDomicile) {
		StateofDomicile = stateofDomicile;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getInstitutionCode() {
		return InstitutionCode;
	}
	public void setInstitutionCode(String institutionCode) {
		InstitutionCode = institutionCode;
	}
	public String getSetPassword() {
		return SetPassword;
	}
	public void setSetPassword(String setPassword) {
		SetPassword = setPassword;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	
}
