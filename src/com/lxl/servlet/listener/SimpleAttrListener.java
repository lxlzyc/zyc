package com.lxl.servlet.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * ��������
 * @author lxl
 *
 */
public class SimpleAttrListener implements ServletContextAttributeListener {

	/**
	 * ��������ʱ�����¼�
	 */
	public void attributeAdded(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		//��ȡ������
		System.out.println("SimpleAttrListener-->�������ԣ�"+event.getName()+" value:"+event.getValue());
	}

	/**
	 * �Ƴ�����ʱ�����¼�
	 */
	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleAttrListener-->�Ƴ����ԣ�"+event.getName()+" value:"+event.getValue());
	}

	/**
	 * ��������ʱ�����¼�
	 */
	public void attributeReplaced(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleAttrListener-->�������ԣ�"+event.getName()+" value:"+event.getValue());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
