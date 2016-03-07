package com.lxl.vo;

/**
 * Userlogin entity. @author MyEclipse Persistence Tools
 */

public class Userlogin implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String username;
	private String userpassword;
	private String loginflag;
	private String loginip;
	private String bz1;
	private String bz2;
	

	public Userlogin(String username, String userpassword) {
		super();
		this.username = username;
		this.userpassword = userpassword;
	}

	private String bz3;

	// Constructors

	/** default constructor */
	public Userlogin() {
		super();
	}

	/** minimal constructor */
	public Userlogin(String userpassword) {
		this.userpassword = userpassword;
	}

	/** full constructor */
	public Userlogin(String username, String userpassword, String loginflag,
			String loginip, String bz1, String bz2, String bz3) {
		this.username = username;
		this.userpassword = userpassword;
		this.loginflag = loginflag;
		this.loginip = loginip;
		this.bz1 = bz1;
		this.bz2 = bz2;
		this.bz3 = bz3;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getLoginflag() {
		return this.loginflag;
	}

	public void setLoginflag(String loginflag) {
		this.loginflag = loginflag;
	}

	public String getLoginip() {
		return this.loginip;
	}

	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}

	public String getBz1() {
		return this.bz1;
	}

	public void setBz1(String bz1) {
		this.bz1 = bz1;
	}

	public String getBz2() {
		return this.bz2;
	}

	public void setBz2(String bz2) {
		this.bz2 = bz2;
	}

	public String getBz3() {
		return this.bz3;
	}

	public void setBz3(String bz3) {
		this.bz3 = bz3;
	}

}