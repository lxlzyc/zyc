package com.lxl.javabase;

import com.lxl.javabase.ThisDemo.People;

public class StaticDemo {

	/**
	 * 使用static声明全局属性
	 * 使用static声明方法，直接通过类名调用
	 * 使用static方法的时候，只能访问static声明的属性和方法，而非static声明的属性和方法不能调用
	 * 
	 */
	public static void main(String[] args) {
		//people的路径
		People p = new People(12, "sasas");
		p.tell();

	}

}
