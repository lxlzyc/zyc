package com.lxl.servlet.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
/**
 * 
 * ����Ҫ���õ�session���Լ���
 * @author lxl
 *
 */
public class SimpleSessBinListener implements HttpSessionBindingListener {

	/**
	 * �����Ե�session
	 */
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessBinListener--> session�� �� sessionid="+event.getSession().getId());

	}

	/**
	 * ������� session
	 */
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessBinListener--> session��� �� sessionid="+event.getSession().getId());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
