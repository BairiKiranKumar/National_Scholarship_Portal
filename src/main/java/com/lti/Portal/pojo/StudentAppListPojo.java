package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentlists")
public class StudentAppListPojo
{
	
	@Column(name="name")
	private String name;
	@Column(name="adhaarcard")
	private String Adhaar;
	@Id
	@Column(name="email")
	private String Email;
	@Column(name="scholarshiptype")
	private String Scholarship;
	public StudentAppListPojo()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentAppListPojo(String name, String adhaar, String email, String scholarship) {
		super();
		this.name = name;
		this.Adhaar = adhaar;
		this.Email = email;
		this.Scholarship = scholarship;
	}

	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAdhaar() 
	{
		return Adhaar;
	}
	public void setAdhaar(String adhaar) 
	{
		Adhaar = adhaar;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getScholarship() {
		return Scholarship;
	}
	public void setScholarship(String scholarship) {
		Scholarship = scholarship;
	}
}