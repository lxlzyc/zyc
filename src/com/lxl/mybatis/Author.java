package com.lxl.mybatis;

import com.lxl.vo.Userlogin;

public class Author {
	private Integer id;
	private Userlogin userlogin;
	private String realName;
	private String IDCard;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Userlogin getUserlogin() {
		return userlogin;
	}
	public void setUserlogin(Userlogin userlogin) {
		this.userlogin = userlogin;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getIDCard() {
		return IDCard;
	}
	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
}
