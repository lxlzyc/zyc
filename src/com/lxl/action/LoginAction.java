package com.lxl.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String username;
	private String password;
	
	//.do跳转默认调用方法
	//struts2完成自动数据封装自动数据获取功能
	public String execute() throws Exception{
		if("admin".equals(username)){
			return "success";
		}else{
			return "fail";
		}
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
