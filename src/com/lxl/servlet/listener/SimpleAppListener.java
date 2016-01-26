package com.lxl.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 监听application
 * @author lxl
 *
 */
public class SimpleAppListener implements ServletContextListener {

	/**
	 * 初始化
	 */
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		//输出虚拟路径名
		System.out.println("SimpleAppListener-->application初始化  "+event.getServletContext().getContextPath());
	}
	
	/**
	 * 销毁
	 */
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleAppListener-->application销毁  "+event.getServletContext().getContextPath());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
