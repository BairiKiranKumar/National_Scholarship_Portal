package com.lti.Portal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="submitdetails")
	public class SubmitDetails {
		@Id
		@Column(name="loginid")
		private String loginid;
		@Column(name="gender")
		private String gender;
		@Column(name="scheme")
		private String scheme;
//		@Column(name="girlscheme")
//		private String girlscheme;
//		@Column(name="boyscheme")
//		private String boyscheme;
//		
		
		@Override
		public String toString() {
			return "SubmitDetails [loginid=" + loginid + ",gender="+gender+",scheme="+scheme+"]";
		}


		public SubmitDetails() {
			super();
		}
	
		
		public SubmitDetails(String loginid,String gender,String scheme ) {
			super();
			this.loginid = loginid;
			this.gender=gender;
			this.scheme=scheme;
		}


		public String getLoginid() {
			return loginid;
		}


		public void setLoginid(String loginid) {
			this.loginid = loginid;
		}

           
		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getScheme() {
			return scheme;
		}


		public void setScheme(String scheme) {
			this.scheme = scheme;
		}


//		public String getGirlscheme() {
//			return girlscheme;
//		}
//
//
//		public void setGirlscheme(String girlscheme) {
//			this.girlscheme = girlscheme;
//		}
//
//
//		public String getBoyscheme() {
//			return boyscheme;
//		}
//
//
//		public void setBoyscheme(String boyscheme) {
//			this.boyscheme = boyscheme;
//		}


		


		


		
		
}
