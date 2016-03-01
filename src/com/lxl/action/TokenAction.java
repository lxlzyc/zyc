package com.lxl.action;

import com.lxl.vo.Userlogin;
import com.opensymphony.xwork2.ActionSupport;

public class TokenAction extends ActionSupport {
	public String execute() throws Exception{
		return SUCCESS;
	}
	//继承自父类的方法，用于数据校验
	public void validateExecute(){
		//为name是username的属性赋值错误信息
		//这些错误信息被以集合形式放入struts2默认的栈队中  map集合 errors   
		this.addFieldError("username","username has error");
		
		this.addActionError("action级别错误");
	}
}
