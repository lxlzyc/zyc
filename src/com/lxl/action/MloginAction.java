package com.lxl.action;

import com.lxl.vo.Userlogin;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MloginAction extends ActionSupport implements ModelDriven<Userlogin>{
	//模型驱动action
	private Userlogin us = new Userlogin();
	
	public String execute() throws Exception{
		System.out.println("____-------------"+us.getUsername());
		return "success";
	}

	@Override
	public Userlogin getModel() {
		// TODO Auto-generated method stub
		//当请求发送到action前先调用这个方法封装到实例化的对象中，
		//获得该类后也获取到该类的类型
		//获得类类型后获得类中的属性
		//request.getParameters获得表单提交的所有属性名
		//从而获得值
		//如果表单提交的name值与失蹄类中的属性名一致
		//则将数据封装到us中
		return us;
	}
}
