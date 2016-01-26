package com.lxl.servlet.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * 监听request属性变化
 * @author wbliuhong
 *
 */
public class SimpleReqAttrListener implements ServletRequestAttributeListener {

	/**
	 * 增加属性
	 */
	public void attributeAdded(ServletRequestAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleReqAttrListener-->创建属性："+event.getName()+" value:"+event.getValue());

	}

	/**
	 * 移除属性
	 */
	public void attributeRemoved(ServletRequestAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleReqAttrListener-->移除属性："+event.getName()+" value:"+event.getValue());

	}

	/**
	 * 更新属性
	 */
	public void attributeReplaced(ServletRequestAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleReqAttrListener-->更新属性："+event.getName()+" value:"+event.getValue());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
