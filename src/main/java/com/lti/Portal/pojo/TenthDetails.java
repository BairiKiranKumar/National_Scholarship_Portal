package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tenthdetails")
public class TenthDetails {
	@Id
	@Column(name="loginid")
	private String loginid;
	@Column(name="tenthrollno")
	private String tenthrollno;
	@Column(name="tenthboardname")
	private String tenthboardname;
	@Column(name="tenthyear")
	private String tenthyear;
	@Column(name="tenthpercentage")
	private String tenthpercentage;
	
	
	@Override
	public String toString() {
		return "TenthDetails [loginId=" + loginid + ", TenthRollno=" + tenthrollno + ", Tenthboardname="
				+ tenthboardname + ", Tenthyear=" + tenthyear + ", Tenthpercentage=" + tenthpercentage + "]";
	}

	public TenthDetails() {
		super();
	}
	
	public TenthDetails(String loginid, String tenthrollno, String tenthboardname, String tenthyear,
			String tenthpercentage) {
		super();
		this.loginid = loginid;
		this.tenthrollno = tenthrollno;
		this.tenthboardname = tenthboardname;
		this.tenthyear = tenthyear;
		this.tenthpercentage = tenthpercentage;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
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

	
	
}
