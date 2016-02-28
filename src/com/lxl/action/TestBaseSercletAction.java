package com.lxl.action;

import com.lxl.servlet.BaseServletT;
import com.lxl.vo.Userlogin;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
//继承后调用父类的dopost 方法
public class TestBaseSercletAction extends BaseServletT{
	//模型驱动action
	private Userlogin us = new Userlogin();
	
	public String execute() throws Exception{
		System.out.println("____-------------"+us.getUsername());
		return "success";
	}

	public Userlogin getModel() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		return us;
	}
}
