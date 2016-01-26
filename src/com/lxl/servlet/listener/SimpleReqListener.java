package com.lxl.servlet.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
/**
 * 监听request
 * @author lxl
 *
 */
public class SimpleReqListener implements ServletRequestListener {

	/**
	 * 销毁request
	 */
	public void requestDestroyed(ServletRequestEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleReqListener-->销毁request： http://"+event.getServletRequest().getRemoteAddr()+event.getServletContext().getContextPath());

	}

	/**
	 * 创建request
	 */
	public void requestInitialized(ServletRequestEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleReqListener-->创建request： http://"+event.getServletRequest().getRemoteAddr()+event.getServletContext().getContextPath());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
