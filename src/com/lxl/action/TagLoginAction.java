package com.lxl.action;

import com.lxl.vo.Userlogin;
import com.opensymphony.xwork2.ActionSupport;

public class TagLoginAction  extends ActionSupport{
	//标签驱动action
	private Userlogin us;
	
	public String execute() throws Exception{
		System.out.println(us.getUsername());
		return "/success.jsp";
	}
	
	public Userlogin getUs() {
		return us;
	}
	public void setUs(Userlogin us) {
		this.us = us;
	}
	
}
