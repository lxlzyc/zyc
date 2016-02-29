package com.lxl.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 使用requestAware拦截器
 * @author Administrator
 *
 */
public class SecondInterceptorAction extends ActionSupport implements 
		RequestAware{
	
	private ServletRequest request;
	private ServletResponse response;
	//服务器对象
	private ServletContext context;
	
	public String execute() throws Exception{
		return "success";
	}
	
	/**
	 * map集合以键值对存储了web对象
	 */
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request = (ServletRequest)arg0.get(StrutsStatics.HTTP_REQUEST);
		response = (ServletResponse)arg0.get(StrutsStatics.HTTP_RESPONSE);
		context = (ServletContext)arg0.get(StrutsStatics.SERVLET_CONTEXT);

	}

}
