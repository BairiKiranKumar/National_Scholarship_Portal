package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentschemes123")
public class StudentHome 
{
	
	@Column(name="Name")
	private String name;
	@Id
	@Column(name="email")
	private String email;
	@Column(name="tehthpercentage")
	private String tenthper;
	@Column(name="twelvepercentage")
	private String twelper;
	@Column(name="scheme")
	private String scheme;
	@Column(name="girlscheme")
	private String Girlscheme;
	@Column(name="community")
	private String community;
	@Override
	public String toString() {
		return "StudentHome [name=" + name + ", email=" + email + ", tenthper=" + tenthper + ", twelper=" + twelper
				+ ", scheme=" + scheme + ", Girlscheme=" + Girlscheme + ", community=" + community + "]";
	}
	public StudentHome() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentHome(String name, String email, String tenthper, String twelper, String scheme, String girlscheme,
			String community) {
		super();
		this.name = name;
		this.email = email;
		this.tenthper = tenthper;
		this.twelper = twelper;
		this.scheme = scheme;
		this.Girlscheme = girlscheme;
		this.community = community;
	}
	public String getGirlscheme() {
		return Girlscheme;
	}

	public void setGirlscheme(String girlscheme) {
		Girlscheme = girlscheme;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTenthper() {
		return tenthper;
	}
	public void setTenthper(String tenthper) {
		this.tenthper = tenthper;
	}
	public String getTwelper() {
		return twelper;
	}
	public void setTwelper(String twelper) {
		this.twelper = twelper;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	
}
