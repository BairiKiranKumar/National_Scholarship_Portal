package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="otherdetails")
public class OtherDetails {
	@Id
	@Column(name="loginid")
	private String loginid;
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
	
	
	@Override
	public String toString() {
		return "OtherDetails [loginid=" + loginid + ", isdisabled=" + isdisabled + ", typeofdisability="
				+ typeofdisability + ", disablitypercentage=" + disablitypercentage + ", maritalstatus=" + maritalstatus
				+ ", parentsprofession=" + parentsprofession + "]";
	}



	public OtherDetails() {
		super();
	}
	
	

	public OtherDetails(String loginId, String isdisabled, String typeofdisability, String disablitypercentage,
			String maritalstatus, String parentsprofession) {
		super();
		this.loginid = loginId;
		this.isdisabled = isdisabled;
		this.typeofdisability = typeofdisability;
		this.disablitypercentage = disablitypercentage;
		this.maritalstatus = maritalstatus;
		this.parentsprofession = parentsprofession;
	}



	public String getLoginid() {
		return loginid;
	}



	public void setLoginid(String loginid) {
		this.loginid = loginid;
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



	
	
}
