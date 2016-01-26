package com.lxl.servlet.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
/**
 * 
 * 不需要配置的session属性监听
 * @author lxl
 *
 */
public class SimpleSessBinListener implements HttpSessionBindingListener {

	/**
	 * 绑定属性到session
	 */
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessBinListener--> session绑定 ： sessionid="+event.getSession().getId());

	}

	/**
	 * 解绑属性 session
	 */
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessBinListener--> session解绑 ： sessionid="+event.getSession().getId());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
