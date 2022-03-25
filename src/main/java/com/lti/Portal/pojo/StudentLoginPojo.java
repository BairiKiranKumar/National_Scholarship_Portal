package com.lti.Portal.pojo;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentlogin122")
public class StudentLoginPojo 
{
	
	//@GeneratedValue()
	@Id
	@Column(name="email")
	private String Email;
	@Column(name="password")
	private String pass;
	@Override
	public String toString() {
		return "StudentLoginPojo [Email=" + Email + ", pass=" + pass +"]";
	}
	public StudentLoginPojo() {
		super();
		//TODO Auto-generated constructor stub
	}
	public StudentLoginPojo(String email, String pass) {
		super();
		this.Email = email;
		this.pass = pass;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
