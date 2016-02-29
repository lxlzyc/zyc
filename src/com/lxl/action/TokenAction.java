package com.lxl.action;

import com.opensymphony.xwork2.ActionSupport;

public class TokenAction extends ActionSupport {
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String execute() throws Exception{
		return SUCCESS;
	}
}
