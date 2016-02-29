package com.lxl.action;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.lxl.vo.Userlogin;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	//属性驱动
	private String username;
	private String userpassword;
	
	//.do跳转默认调用方法
	//struts2完成自动数据封装自动数据获取功能
	public String execute() throws Exception{
		if("admin".equals(username) ){
			Userlogin ul = new Userlogin();
			ul.setUsername(username);
			ul.setUserpassword(userpassword);
			
			ServletRequest request = ServletActionContext.getRequest();
			HttpServletRequest hrequest = (HttpServletRequest)request;
			HttpSession session = hrequest.getSession();
			session.setAttribute("userlogin", ul);
			return "success";
		}else{
			return "fail";
		}
		//servletContext 也就是application对象
		//存储到服务器内存中，严禁写入多余数据(会导致服务器内存溢出)		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
}
