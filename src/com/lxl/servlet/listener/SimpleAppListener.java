package com.lxl.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ����application
 * @author lxl
 *
 */
public class SimpleAppListener implements ServletContextListener {

	/**
	 * ��ʼ��
	 */
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		//�������·����
		System.out.println("SimpleAppListener-->application��ʼ��  "+event.getServletContext().getContextPath());
	}
	
	/**
	 * ����
	 */
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleAppListener-->application����  "+event.getServletContext().getContextPath());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
