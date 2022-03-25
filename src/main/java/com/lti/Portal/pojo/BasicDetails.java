package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="basicdetails")
public class BasicDetails {
	@Id
	@Column(name="loginid")
	private String loginid;
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
	@Override
	public String toString() {
		return "BasicDetails [loginid=" + loginid + ", aadharno=" + aadharno + ", religion=" + religion + ", community="
				+ community + ", fatherName=" + fatherName + ", motherName=" + motherName + ", annualIncome="
				+ annualIncome + "]";
	}



	public BasicDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	public BasicDetails(String loginid, String aadharno, String religion, String community, String fatherName,
			String motherName, String annualIncome) {
		super();
		this.loginid = loginid;
		this.aadharno = aadharno;
		this.religion = religion;
		this.community = community;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.annualIncome = annualIncome;
	}



	public String getLoginid() {
		return loginid;
	}



	public void setLoginid(String loginid) {
		this.loginid = loginid;
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



	
}
