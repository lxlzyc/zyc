package com.lxl.servlet.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * session����
 * @author lxl
 *
 */
public class SimpleSessListener implements HttpSessionListener {

	/**
	 * session����
	 */
	public void sessionCreated(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		//��ȡsession
		System.out.println("SimpleSessListener--> session���� �� sessionid="+event.getSession().getId());
	}

	/**
	 * session����
	 */
	public void sessionDestroyed(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessListener--> session���� �� sessionid="+event.getSession().getId());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
