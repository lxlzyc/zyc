package com.lxl.servlet.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SimpleSessAttrListener implements HttpSessionAttributeListener {

	/**
	 * session��������ʱ�����¼�
	 */
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessAttrListener-->session��������   sessionid: "+event.getSession().getId()+" �������ԣ�"+event.getName()+" value:"+event.getValue());
	}

	/**
	 * session�Ƴ�����ʱ�����¼�
	 */
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessAttrListener-->session�Ƴ�����   sessionid: "+event.getSession().getId()+" �������ԣ�"+event.getName()+" value:"+event.getValue());

	}

	/**
	 * session��������ʱ�����¼�
	 */
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessAttrListener-->session��������   sessionid: "+event.getSession().getId()+" �������ԣ�"+event.getName()+" value:"+event.getValue());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
