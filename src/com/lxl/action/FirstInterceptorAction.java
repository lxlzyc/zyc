package com.lxl.action;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class FirstInterceptorAction extends ActionSupport implements
		ServletRequestAware,ServletResponseAware,ServletContextAware {
	/**
	 * 通过接口获取各属性
	 * session直接获取不用接口
	 */
	private ServletRequest request;
	private ServletResponse response;
	//ServletContext 就是application
	private ServletContext context;
	
	public String execute() throws Exception{
		return "success";
	}
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
	
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		response = arg0;
	}

	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		context = arg0;
	}
}
