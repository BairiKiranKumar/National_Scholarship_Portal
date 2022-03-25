package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="academicdetails")
public class AcademicDetails {
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
	
	public AcademicDetails() {
		super();
	}
	public String toString() {
		return "AcademicDetails[loginId=" + loginid + ",institution="+institution+",presentClass="+presentClass+",presentClassYear="+presentClassYear+"modeofstudy="+modeofstudy+",classStartDate="+classofdate+",university="+university+",previousClass="+previousClass+",previousClassYear="+previousClassYear+",previousPercentage="+previousPercentage+"]";
	}
	public AcademicDetails(String loginid,String institution,String presentClass,String presentClassYear,String modeofstudy,String classofdate,String university,String previousClass,String previousClassYear,String previousPercentage) {
		super();
		this.loginid = loginid;
		this.institution=institution;
		this.presentClass=presentClass;
		this.presentClassYear=presentClassYear;
		this.modeofstudy=modeofstudy;
		this.classofdate=classofdate;
		this.university=university;
		this.previousClass=previousClass;
		this.previousClassYear=previousClassYear;
		this.previousPercentage=previousPercentage;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginId(String loginid) {
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
	
	
}
