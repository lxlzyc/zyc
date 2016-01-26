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
	 * 初始化servlet
	 */
	public void init() throws ServletException{
		
	}
	/**
	 * 处理get提交的数据
	 */
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		doPost(req, resp);
		
	}
	/**
	 * 处理post提交的数据
	 */
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		//存入session
		HttpSession ses = req.getSession();
		ses.setAttribute("username", username);
		ses.setAttribute("password", password);
		resp.sendRedirect("jsp/main.jsp");
	}
	/**
	 * 销毁servlet
	 */
	public void destroy(){
		
	}
	
}
