package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedetails")
public class FeeDetails {
	@Id
	@Column(name="loginid")
	private String loginid;
	@Column(name="Admissionfee")
	private String admissionfee;
	@Column(name="Tuitionfee")
	private String tuitionfee;
	@Column(name="Otherfee")
	private String otherfee;
	
	
	@Override
	public String toString() {
		return "FeeDetails [loginId=" + loginid + ", admissionfee=" + admissionfee + ", tuitionfee=" + tuitionfee
				+ ", otherfee=" + otherfee + "]";
	}



	public FeeDetails() {
		super();
	}
	


	public FeeDetails(String loginid, String admissionfee, String tuitionfee, String otherfee) {
		super();
		this.loginid = loginid;
		this.admissionfee = admissionfee;
		this.tuitionfee = tuitionfee;
		this.otherfee = otherfee;
	}



	public String getLoginid() {
		return loginid;
	}



	public void setLoginid(String loginid) {
		this.loginid = loginid;
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



	
	
}
