package com.lxl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxl.database.DatabaseConnection;

public class LoginServlet extends HttpServlet  {
	/**
	 * ��ʼ��servlet
	 */
	public void init() throws ServletException{
		
	}
	/**
	 * ����get�ύ�����
	 */
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		doPost(req, resp);
		
	}
	/**
	 * ����post�ύ�����
	 */
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		
		System.out.println("username"+username);
		//����session
		HttpSession ses = req.getSession();
		ses.setAttribute("username", username);
		System.out.println("session的value"+ses.getAttribute("username"));
		ses.setAttribute("password", password);
		resp.sendRedirect("jsp/main.jsp");
	}
	/**
	 * ���servlet
	 */
	public void destroy(){
		
	}
	
}
