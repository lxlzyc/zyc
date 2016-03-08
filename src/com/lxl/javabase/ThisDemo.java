package com.lxl.javabase;

public class ThisDemo {

	/**
	 * this关键字
	 * 表示类中的属性和调用方法
	 * 调用本类中的构造方法
	 * 表示当前对象
	 * 
	 */
	static class People{
		private int age;
		private String name;
		
		public People(){
			System.out.println(" 无参数构造方法");
		}
		
		public People(int age,String name){
			//this调用无参数构造方法 且只能放在首行
			this();
			this.age = age;
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void tell(){
			//this表示当前的方法
			System.out.println(this.getName()+"|"+this.getAge());
		}
	}
	public static void main(String[] args) {
		People p = new People(12, "sasas");
		p.tell();
	}

}
