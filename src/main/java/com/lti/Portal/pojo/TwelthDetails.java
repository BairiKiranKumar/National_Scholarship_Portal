package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="twelthdetails")
public class TwelthDetails {
	@Id
	@Column(name="loginid")
	private String loginid;
	@Column(name="twelthrollno")
	private String twelthrollno;
	@Column(name="twelthboardname")
	private String twelthboardname;
	@Column(name="twelthyear")
	private String twelthyear;
	@Column(name="twelthpercentage")
	private String twelthpercentage;
	@Override
	public String toString() 
	{
		return "TwelthDetails [loginId=" + loginid + ", TwelthRollno=" + twelthrollno + ", Twelthboardname="
				+ twelthboardname + ", Twelthyear=" + twelthyear + ", Twelthpercentage=" + twelthpercentage + "]";
	}
	public TwelthDetails() 
	{
		super();
	}
	public TwelthDetails(String loginid, String twelthrollno, String twelthboardname, String twelthyear,
			String twelthpercentage) {
		super();
		this.loginid = loginid;
		this.twelthrollno = twelthrollno;
		this.twelthboardname = twelthboardname;
		this.twelthyear = twelthyear;
		this.twelthpercentage = twelthpercentage;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
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

	
	
}
