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
 * �򵥹�����
 * @author lxl
 *
 */
public class SimpleFilter implements Filter {
	/**
	 * ��ʼ��
	 */
	private String charSet;
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.charSet = config.getInitParameter("charset");
	}
	/**
	 * ���
	 */
	public void destroy() {
		// TODO Auto-generated method stub

	}

	/**
	 * ִ�й�����
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		//����ͳһ�ַ�
		request.setCharacterEncoding(this.charSet);
		HttpServletRequest req = (HttpServletRequest) request; //����ת��
		HttpSession ses = req.getSession();
		//�ж��û��Ƿ��¼
		if(ses.getAttribute("username") != null){
			chain.doFilter(request, response);
		}else{
			System.out.println("过滤");
//			chain.doFilter(request, response);
			//����ת�� ע��·����  /
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
