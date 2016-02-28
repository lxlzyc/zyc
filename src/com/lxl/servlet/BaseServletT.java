package com.lxl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxl.database.DatabaseConnection;

public class BaseServletT extends HttpServlet  {
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
		
		//当请求发送到action前先调用这个方法封装到实例化的对象中，
		//获得该类后也获取到该类的类型
		//获得类类型后获得类中的属性
		//request.getParameters获得表单提交的所有属性名
		//从而获得值
		//如果表单提交的name值与失蹄类中的属性名一致
		//则将数据封装到us中
		try {
			//this是调用此父类的子类
			System.out.println("~~~~~~~~~~~~~~~!!!!!!!!!!!!!!!!!!!!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			Method method = this.getClass().getDeclaredMethod("getModel", null);
			//当请求发送到action前先调用这个方法封装到实例化的对象中，
			Object obj = method.invoke(this, null);
			//获得该类后也获取到该类的类型(返回值的类)
			Class cl = obj.getClass();
			//获得类类型后获得类中的属性
			Field[] fi = cl.getDeclaredFields();
			//(枚举类型)request.getParameters获得表单提交的所有属性名
			Enumeration em = req.getParameterNames();
			while(em.hasMoreElements()){
				//如果表单提交的name值与失蹄类中的属性名一致
				//则将数据封装到us中
				String fieldName = em.nextElement().toString();
				for(int i =0;i<fi.length;i++){
					if(fieldName.equals(fi[i].getName())){
						//设置访问权限暴露private属性
						fi[i].setAccessible(true);
						fi[i].set(obj, req.getParameter(fieldName));
					}
				}
			}
			
			Method method2 = this.getClass().getDeclaredMethod("execute", null);
			Object url = method2.invoke(this, null);
			System.out.println("========================================="+url.toString());
//			req.getRequestDispatcher(url.toString()).forward(req, resp);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
		
		
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
