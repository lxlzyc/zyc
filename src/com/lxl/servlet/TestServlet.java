package com.lxl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxl.database.DatabaseConnection;

public class TestServlet extends HttpServlet {
	
	/**
	 * ��ʼ��servlet
	 */
	public void init() throws ServletException{
		
	}
	/**
	 * ����get�ύ������
	 */
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		doPost(req, resp);
		
	}
	/**
	 * ����post�ύ������
	 */
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{

	}
	/**
	 * ����servlet
	 */
	public void destroy(){
		
	}

}
