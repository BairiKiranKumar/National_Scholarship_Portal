package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="institutionlogin123")
public class InstitutionLogin 
{
	@Id
	@Column(name="loginid")
	private String LoginId;
	@Column(name="password")
	private String Password;
	
	
	@Override
	public String toString() {
		return "InstitutionLogin [LoginId=" + LoginId + ", Password=" + Password + "]";
	}

	public InstitutionLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InstitutionLogin(String loginId, String password) {
		super();
		LoginId = loginId;
		Password = password;
	}

	public String getLoginId() {
		return LoginId;
	}
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
