package com.lxl.struts2Interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
//struts2中拦截器
public class FirstInterceptor implements Interceptor {
	//struts配置初始化时，要为此参数添加get set方法
	private String loginName;
	
	//销毁
	public void destroy() {
		// TODO Auto-generated method stub

	}

	//初始化 程序启动时拦截器被初始化完毕
	public void init() {
		// TODO Auto-generated method stub

	}

	//拦截器核心代码
	public String intercept(ActionInvocation arg0) throws Exception {
		//arg.invoke()  让拦截器请求继续前进 访问需要的资源
		//returnName action会返回的字符串
		String returnName = arg0.invoke();
		//return到result
		return returnName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
}
