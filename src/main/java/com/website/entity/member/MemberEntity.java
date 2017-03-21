package com.website.entity.member;

import java.io.Serializable;

import com.website.entity.Entity;

public class MemberEntity extends Entity implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String account;
	private String passwd;
	private String payment_passwd;
	private String mobile;
	private int status;
	
	private java.sql.Date mdate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getPayment_passwd() {
		return payment_passwd;
	}

	public void setPayment_passwd(String payment_passwd) {
		this.payment_passwd = payment_passwd;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	

	public java.sql.Date getMdate() {
		return mdate;
	}

	public void setMdate(java.sql.Date mdate) {
		this.mdate = mdate;
	}
}
