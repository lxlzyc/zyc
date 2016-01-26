package com.lxl.servlet.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SimpleSessAttrListener implements HttpSessionAttributeListener {

	/**
	 * session增加属性时触发事件
	 */
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessAttrListener-->session增加属性   sessionid: "+event.getSession().getId()+" 增加属性："+event.getName()+" value:"+event.getValue());
	}

	/**
	 * session移除属性时触发事件
	 */
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessAttrListener-->session移除属性   sessionid: "+event.getSession().getId()+" 增加属性："+event.getName()+" value:"+event.getValue());

	}

	/**
	 * session更新属性时触发事件
	 */
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleSessAttrListener-->session更新属性   sessionid: "+event.getSession().getId()+" 增加属性："+event.getName()+" value:"+event.getValue());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
