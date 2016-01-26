package com.lxl.servlet.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * 监听属性
 * @author lxl
 *
 */
public class SimpleAttrListener implements ServletContextAttributeListener {

	/**
	 * 增加属性时触发事件
	 */
	public void attributeAdded(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		//获取属性名
		System.out.println("SimpleAttrListener-->创建属性："+event.getName()+" value:"+event.getValue());
	}

	/**
	 * 移除属性时触发事件
	 */
	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleAttrListener-->移除属性："+event.getName()+" value:"+event.getValue());
	}

	/**
	 * 更新属性时触发事件
	 */
	public void attributeReplaced(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleAttrListener-->更新属性："+event.getName()+" value:"+event.getValue());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
