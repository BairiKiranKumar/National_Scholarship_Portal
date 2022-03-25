package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adminlogin123")
public class AdminLoginPojo 
{
	@Id
	@Column(name="Admin")
	private String admin;
	@Column(name="Password")
	private String password;
	
	@Override
	public String toString() {
		return "AdminLoginPojo [admin=" + admin + ", password=" + password + "]";
	}

	public AdminLoginPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AdminLoginPojo(String admin, String password) {
		super();
		this.admin = admin;
		this.password = password;
	}

	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
