package com.lxl.action;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ThirdInterceptAction extends ActionSupport {
	//该方法只要获取静态对象不需继承接口
	
	public String execute() throws Exception{
		//通过ActionContext获取各属性
		//ActionContext是map集合形式
		ActionContext ac = ActionContext.getContext();
		ServletRequest request = (ServletRequest) ac.get(ServletActionContext.HTTP_REQUEST);
		ServletResponse response = (ServletResponse) ac.get(ServletActionContext.HTTP_RESPONSE);
		ServletContext context = (ServletContext) ac.get(ServletActionContext.SERVLET_CONTEXT);
		return "success";
	}
	
}
