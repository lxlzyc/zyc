package com.lxl.servlet.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * ����request���Ա仯
 * @author wbliuhong
 *
 */
public class SimpleReqAttrListener implements ServletRequestAttributeListener {

	/**
	 * ��������
	 */
	public void attributeAdded(ServletRequestAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleReqAttrListener-->�������ԣ�"+event.getName()+" value:"+event.getValue());

	}

	/**
	 * �Ƴ�����
	 */
	public void attributeRemoved(ServletRequestAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleReqAttrListener-->�Ƴ����ԣ�"+event.getName()+" value:"+event.getValue());

	}

	/**
	 * ��������
	 */
	public void attributeReplaced(ServletRequestAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("SimpleReqAttrListener-->�������ԣ�"+event.getName()+" value:"+event.getValue());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
