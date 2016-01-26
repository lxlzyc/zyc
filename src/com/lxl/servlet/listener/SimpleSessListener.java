package com.lxl.servlet.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * session监听
 * @author lxl
 *
 */
public class SimpleSessListener implements HttpSessionListener {

	/**
	 * session创建
	 */
	public void sessionCreated(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		//获取session
		System.out.println("SimpleSessListener--> session创建 ： sessionid="+event.getSession().getId());
	}

	/**
	 * session销毁
	 */
	public void sessionDestroyed(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessListener--> session销毁 ： sessionid="+event.getSession().getId());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
