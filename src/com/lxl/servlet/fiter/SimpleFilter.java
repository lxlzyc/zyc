package com.lxl.servlet.fiter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
/**
 * 简单过滤器
 * @author lxl
 *
 */
public class SimpleFilter implements Filter {
	/**
	 * 初始化
	 */
	private String charSet;
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.charSet = config.getInitParameter("charset");
	}
	/**
	 * 销毁
	 */
	public void destroy() {
		// TODO Auto-generated method stub

	}

	/**
	 * 执行过滤器
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		//设置统一字符集
		request.setCharacterEncoding(this.charSet);
		HttpServletRequest req = (HttpServletRequest) request; //向下转型
		HttpSession ses = req.getSession();
		//判断用户是否登录
		if(ses.getAttribute("username") != null){
			chain.doFilter(request, response);
		}else{
//			chain.doFilter(request, response);
			//请求转发 注意路径加  /
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
