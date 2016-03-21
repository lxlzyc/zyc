package com.lxl.study;

public class TestString {
	//String 
	//String 是final的
	
	public static void main(String[] args){
		//分配char数组存储hello  m引用此字符串
		String m = "hello";
		//n在常量池中 引用此字符串
		String n = "hello";
		//生成一个新的字符串，但字符串内部的字符数组引用m内部的字符数组
		String u = new String(m);
		//生成一个新字符串，但内部的字符数组引用常量池里面的字符串内部的字符数组
		String v = new String("hello");
		//m 和 n是同一个对象   m,v,u不是同一个对象但用equal判断的话会返回true
		
		
		System.out.println("1");
	}
}
