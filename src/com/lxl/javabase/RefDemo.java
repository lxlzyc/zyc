package com.lxl.javabase;

class Ref1{
	int temp =10;
}


public class RefDemo {

	public static void tell(Ref1 r2){
		r2.temp = 30;
	}
	public static void tell(String str2){
		str2 = "haha";
	}
	public static void tell(int i2){
		i2 = 3;
	}
	//引用传递示例
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ref1 r1 = new Ref1();
		r1.temp=20;
		System.out.println(r1.temp);
		tell(r1);
		System.out.println(r1.temp);
		String str1 = "hehe";
		tell(str1);
		System.out.println(str1);
		int i1 = 1;
		tell(i1);
		System.out.println(i1);
	}

	
	
}
