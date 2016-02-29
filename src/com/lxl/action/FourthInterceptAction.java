package com.lxl.action;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
//推荐本方法
public class FourthInterceptAction {
	

	public String execute() throws Exception{
		//通过ActionContext获取各属性
		//ActionContext是map集合形式
		ServletRequest request = ServletActionContext.getRequest();
		ServletResponse response = ServletActionContext.getResponse();
		ServletContext context = ServletActionContext.getServletContext();
		return "success";
	}
}
