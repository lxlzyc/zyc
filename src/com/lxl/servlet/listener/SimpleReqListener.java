package com.lxl.servlet.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
/**
 * ����request
 * @author lxl
 *
 */
public class SimpleReqListener implements ServletRequestListener {

	/**
	 * ����request
	 */
	public void requestDestroyed(ServletRequestEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleReqListener-->����request�� http://"+event.getServletRequest().getRemoteAddr()+event.getServletContext().getContextPath());

	}

	/**
	 * ����request
	 */
	public void requestInitialized(ServletRequestEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleReqListener-->����request�� http://"+event.getServletRequest().getRemoteAddr()+event.getServletContext().getContextPath());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
